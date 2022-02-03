package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Category;
import trilha.back.financys.services.CategoryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

//    @GetMapping("/listar")
    @GetMapping
    public ResponseEntity<List<Category>> read(){
        return ResponseEntity.ok(categoryService.listarTodos());
    }

//    @GetMapping("/listaId/{id}")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable long id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

//    @PostMapping("/salvar")
    @PostMapping
    public ResponseEntity<Category> create (@RequestBody Category category){
        return ResponseEntity.ok(categoryService.salvar(category));
    }

//    @DeleteMapping("/deletar/{id}")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        categoryService.deletar(id);
        ResponseEntity.ok().build();
    }

//    @PutMapping("/atualizar/{id}")
    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category category){
        return ResponseEntity.ok(categoryService.atualizar(id, category));
    }
}

