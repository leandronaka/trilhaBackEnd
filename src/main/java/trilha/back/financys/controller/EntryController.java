package trilha.back.financys.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entities.Entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api")
//@Api(value = "API REST")
public class EntryController {

    private List<Entry> lista = new ArrayList<Entry>();
    private Integer posicaoEntry;

    @GetMapping("/lancamentos")
//    @ApiOperation(value = "Retorna lista de Lançamentos")
    public ResponseEntity<List<Entry>> read(){
        Collections.sort(lista, Comparator.comparing(Entry::getDate));
        return ResponseEntity.ok().body(lista);
    }
    @PostMapping("/lancamentos")
//    @ApiOperation(value = "Retorna a posição em que foi inserido")
    public ResponseEntity<String> create(@RequestBody Entry entry){
        posicaoEntry = lista.size();
        lista.add(entry);
        return new ResponseEntity<String>(posicaoEntry.toString(),HttpStatus.OK);
    }

}
