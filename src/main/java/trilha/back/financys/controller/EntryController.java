package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.dto.ChartDTO;
import trilha.back.financys.dto.EntryCustomDTO;
import trilha.back.financys.entities.Entry;
import trilha.back.financys.services.EntryService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lancamentos")
public class EntryController {

    @Autowired
    private EntryService entryService;

//    @GetMapping("/listar")
    @GetMapping
    public ResponseEntity<List<Entry>> read(){
        return ResponseEntity.ok(entryService.listarTodos());
    }

//    @GetMapping("/listaId/{id}")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Entry>> findById(@PathVariable long id) {
        return ResponseEntity.ok(entryService.findById(id));
    }

//    @PostMapping("/salvar")
    @PostMapping
    public ResponseEntity<Entry> create (@RequestBody EntryCustomDTO entry){
        return ResponseEntity.ok(entryService.salvar(entry));
    }

//    @DeleteMapping("/deletar/{id}")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        entryService.deletar(id);
        ResponseEntity.ok().build();
    }

//    @PutMapping("/atualizar/{id}")
    @PutMapping("/{id}")
    public ResponseEntity<Entry> update(@PathVariable Long id, @RequestBody EntryCustomDTO entry){
        return ResponseEntity.ok(entryService.atualizar(id, entry));
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

    @GetMapping("/filter")
    public ResponseEntity<Object> getLancamentosDependentes(
            @RequestParam(value = "data_lancamento", required = false) String datalancamento,
            @RequestParam(value = "amount", required = false) String amount,
            @RequestParam(value = "paid", required = false) boolean paid) {
        return ResponseEntity.ok(entryService.getLancamentosDependentes(datalancamento, amount, paid));
    }
}
