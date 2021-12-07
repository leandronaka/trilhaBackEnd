package trilha.back.financys.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Category;
import trilha.back.financys.repository.CategoryRepository;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> read(){
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id) {
        return ResponseEntity.ok(categoryRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Category> create (@RequestBody Category category){
        category.setId(ThreadLocalRandom.current().nextLong(0,10000));
        return new ResponseEntity<>(categoryRepository.save(category), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        categoryRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category category){
        Category categoryAux = categoryRepository.findById(id).get();
        BeanUtils.copyProperties(category, categoryAux, "id");
        return new ResponseEntity<>(categoryRepository.save(categoryAux), HttpStatus.OK);
    }
}

