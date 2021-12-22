package trilha.back.financys.controller;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dto.ChartDTO;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.repository.EntryRepository;
import trilha.back.financys.services.EntryService;

import java.util.List;

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
    public ResponseEntity<Entry> findById(@PathVariable long id) {
        return ResponseEntity.ok(entryRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Entry> create (@RequestBody Entry entry){
        if (entryService.validateCategoryById(entry.getCategoryId().getId()) ==  true){
            entry = entryService.salvar(entry);
            return ResponseEntity.ok().body(entry);
        } else throw new ResourceNotFoundException("Categoria não encontrada!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        entryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@PathVariable long id, @RequestBody Entry entry){
        if (entryService.validateCategoryById(entry.getCategoryId().getId()) ==  true ){
            Entry entryAux = entryRepository.findById(id);
            BeanUtils.copyProperties(entry, entryAux, "id");
            return new ResponseEntity<>(entryRepository.save(entryAux), HttpStatus.OK);
        } else throw new ResourceNotFoundException("Categoria não encontrada!");
    }

    @GetMapping("/dto")
    public ResponseEntity<List<ChartDTO>> listDTO(){
        return ResponseEntity.ok(entryService.listByCategory());
    }

    @GetMapping("/stream")
    public ResponseEntity<Object> listStream(){
        return ResponseEntity.ok(entryService.returnListDTO());
    }

    @GetMapping("/calcula/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable Integer x, @PathVariable Integer y) {
        return ResponseEntity.ok(entryService.calculaMedia(x, y));
    }

}
