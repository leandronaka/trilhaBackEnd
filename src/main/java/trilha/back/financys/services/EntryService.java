package trilha.back.financys.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dto.ChartDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.exception.DivideByZeroException;
import trilha.back.financys.exception.IdNotFound;
import trilha.back.financys.repository.CategoryRepository;
import trilha.back.financys.repository.EntryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;
    private Object EntryDTO;

    public boolean validateCategoryById(long categoryId) {
        if (categoryRepository.existsById(categoryId)) {
            return true;
        }
        return false;
    }

    public List<Entry> listarTodos() {
        return entryRepository.findAll();
    }

    public Optional<Entry> findById(long id) {
        return entryRepository.findById(id);
    }

    public Entry salvar(Entry entry) {
        if (validateCategoryById(entry.getCategoryId().getId()) == true){
            return entryRepository.save(entry);
        } else throw new IdNotFound("Id não encontrado");
    }

    public void deletar(long id) {
        try {
            entryRepository.deleteById(id);
        } catch (RuntimeException e){
            throw new IdNotFound("ID não encontrado!");
        }
    }

    public Entry atualizar(long id, Entry entry){
        try {
            Entry entryAux = entryRepository.findById(id).get();
            BeanUtils.copyProperties(entry, entryAux, "id");
            return entryRepository.save(entryAux);
        } catch (RuntimeException e){
            throw new IdNotFound("ID não encontrado!");
        }
    }

    public List<ChartDTO> listByCategory() {
        List<Entry> entry = entryRepository.findAll();
        List<ChartDTO> chartDTO = new ArrayList<>();
        ChartDTO dto = new ChartDTO();
        double total = 0;

        for (Entry objEntry : entry) {
            dto.setName(objEntry.getName());

            if (dto.getName().equals(objEntry.getName())) {
                total += objEntry.getAmount();
            }
        }

        dto.setAmount(total);
        chartDTO.add(dto);

        return chartDTO;
    }

    public List<ChartDTO> returnListDTO() {
        List<Entry> listEntry = entryRepository.findAll();
        List<ChartDTO> listDTO = new ArrayList<>();

        listEntry.forEach(entry ->
                listDTO.stream().filter(item -> item.getName().equals(entry.getNameCategory())).findAny()
                        .ifPresentOrElse(
                                item -> {
                                    item.setAmount(item.getAmount() + entry.getAmount());
                                },
                                () -> {
                                    listDTO.add(new ChartDTO(entry.getNameCategory(), entry.getAmount()));
                                }
                        ));
        return listDTO;
    }

    private ChartDTO mapToDto(Entry entry) {
        ChartDTO chartDTO = modelMapper.map(entry, ChartDTO.class);
        return chartDTO;
    }

    private Entry mapToEntity(ChartDTO chartDTO) {
        Entry entry = modelMapper.map(chartDTO, Entry.class);
        return entry;
    }

    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        } catch (ArithmeticException e) {
            throw new DivideByZeroException("Não pode dividir por 0!");
        }
    }
}
