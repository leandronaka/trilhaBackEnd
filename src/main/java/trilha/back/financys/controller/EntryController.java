package trilha.back.financys.controller;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.repository.EntryRepository;
import trilha.back.financys.services.EntryService;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private EntryService entryService;

    @GetMapping
    public ResponseEntity<List<Entry>> read(){
        return ResponseEntity.ok(entryRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> finById(@PathVariable long id) {
        return ResponseEntity.ok(entryRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Entry> create (@RequestBody Entry entry){
        if (entryService.validateCategoryById(entry.getCategoryId()) == true) {
            entry = entryService.createService(entry);
            return ResponseEntity.ok().body(entry);
        } else throw new ResourceNotFoundException("Id not exist");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        entryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@PathVariable Long id, @RequestBody Entry entry){
        Entry entryAux = entryRepository.findById(id).get();
        BeanUtils.copyProperties(entry, entryAux, "id");
        return new ResponseEntity<>(entryRepository.save(entryAux), HttpStatus.OK);
    }

}
