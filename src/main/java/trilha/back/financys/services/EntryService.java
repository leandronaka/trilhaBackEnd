package trilha.back.financys.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dto.ChartDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.repository.CategoryRepository;
import trilha.back.financys.repository.EntryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    public Entry salvar(Entry entry) {
        entry.setId(ThreadLocalRandom.current().nextLong(1, 10000));
        return entryRepository.save(entry);
    }

    public List<ChartDTO> listByCategory() {
        List<Category> category = new ArrayList<Category>();
        category = categoryRepository.findAll();
        List<ChartDTO> chartDTO = new ArrayList<ChartDTO>();

        for (Category objCategory : category) {
            List<Entry> entry = entryRepository.findAll();
            double total = 0;
            ChartDTO dto = new ChartDTO();
            dto.setName(objCategory.getName());

            for (Entry objEntry : entry) {
                if (objEntry.getCategoryId().getId() == objCategory.getId()) {
                    total += objEntry.getAmount();
                }
            }
            dto.setAmount(total);
            chartDTO.add(dto);
        }
        return chartDTO;
    }

    public List<ChartDTO> returnListDTO() {
        List<Entry> listEntry = entryRepository.findAll();
        List<Category> listCategory = categoryRepository.findAll();
        List<ChartDTO> listDTO = new ArrayList<>();
        ChartDTO chartDTO = new ChartDTO();

        listEntry.forEach(entry ->
                listDTO.stream().filter(item -> item.getName().equals(entry.getName())).findAny()
                        .ifPresentOrElse(
                                item -> {
                                    item.setName(item.getName());
                                    item.setAmount(item.getAmount() + item.getAmount());
                                },
                                () -> {
                                    listDTO.add(new ChartDTO(entry.getName(), entry.getAmount()));
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
}
