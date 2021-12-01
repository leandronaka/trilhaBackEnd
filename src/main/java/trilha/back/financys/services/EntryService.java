package trilha.back.financys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.repository.CategoryRepository;
import trilha.back.financys.repository.EntryRepository;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public boolean validateCategoryById(long idCategory){
        if (categoryRepository.existsById(idCategory)){
            return true;
        }
        return false;
    }

    public Entry createService (Entry entry){
        entry.setId(ThreadLocalRandom.current().nextLong(1, 10000));
        return entryRepository.save(entry);
    }
}
