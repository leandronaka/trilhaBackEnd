package trilha.back.financys.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.repository.EntryRepository;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    @Autowired
    private EntryRepository entryRepository;

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
        entry.setId(ThreadLocalRandom.current().nextLong(0,10000));
        return new ResponseEntity<>(entryRepository.save(entry), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        entryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@PathVariable Long id, @RequestBody Entry entry){
        Entry entryAux = entryRepository.findById(id).get();
        BeanUtils.copyProperties(entry, entryAux, "id");
        return new ResponseEntity<>(entryRepository.save(entryAux), HttpStatus.OK);
    }

}
