package trilha.back.financys.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dto.ChartDTO;
import trilha.back.financys.dto.EntryDTO;
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
    private ChartDTO chartDTO;

    @Autowired
    private ModelMapper modelMapper;
    private Object EntryDTO;

    public boolean validateCategoryById(long idCategory){
        if (categoryRepository.existsById(idCategory)){
            return true;
        }
        return false;
    }

    public Entry salvar (Entry entry){
        entry.setId(ThreadLocalRandom.current().nextLong(1, 10000));
        return entryRepository.save(entry);
    }

    public List<ChartDTO> listByCategory(){
        List<Category> category = new ArrayList<Category>();
        category = categoryRepository.findAll();
        List<ChartDTO> chartDTO = new ArrayList<ChartDTO>();

        for (Category objCategory : category) {
            List<Entry> entry = entryRepository.findAll();
            double total = 0;
            ChartDTO dto = new ChartDTO();

            for (Entry objEntry : entry) {
                if (objEntry.getCategoryId() == objCategory.getId()) {
                    total += objEntry.getAmount();
                    dto.setName(objEntry.getName());
                    dto.setType(objEntry.getType());
                    dto.setAmount(total);
                }
            }
            chartDTO.add(dto);
        }
        return chartDTO;
    }

    public EntryDTO transformaEmDTO(Entry entry) {
        EntryDTO entryDTO = modelMapper.map(entry, EntryDTO.class);
        return entryDTO;
    }

    public Entry transformaEmObjeto(EntryDTO entryDTO){
        Entry entry = modelMapper.map(EntryDTO, Entry.class);
        return entry;
    }
}
