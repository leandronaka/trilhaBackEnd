package trilha.back.financys.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Category;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
//@Api(value = "API REST")
public class CategoryController {

    private List<Category> lista = new ArrayList<Category>();
    private Integer posicaoCategory;

    @GetMapping("/categorias")
//    @ApiOperation(value = "Retorna lista de categorias")
    public ResponseEntity<List<Category>> read(){
        return ResponseEntity.ok().body(lista);
    }

    @PostMapping("/categorias")
//    @ApiOperation(value = "Retorna a posição em que foi inserido")
    public ResponseEntity<String> create(@RequestBody Category category){
        posicaoCategory = lista.size();
        lista.add(category);
        return new ResponseEntity<String>(posicaoCategory.toString(),HttpStatus.OK);
    }
}

