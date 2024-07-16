package com.example.demo.roupa;

import com.example.demo.endereco.Endereco;
import com.example.demo.endereco.EnderecoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path= "api/v1/roupas")
public class RoupaController {
    @Autowired
    private RoupaService roupaService;
    private static final Logger logger = LoggerFactory.getLogger(RoupaController.class);


    public RoupaController(RoupaService roupaService) {
        this.roupaService = roupaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Roupa> getRoupaById(@PathVariable("id")Long id){
        Roupa roupa = roupaService.getRoupa(id);
        return ResponseEntity.ok(roupa);

    }
    @GetMapping
    public List<Roupa> hello(){
        return  roupaService.getRoupas();
    }

    @PostMapping
    public void registerNewRoupa(@RequestBody RoupaDTO roupaDTO){
        roupaService.addNewRoupa(roupaDTO);
    }

    @DeleteMapping(path = "{roupaId}")
    public void deleteRoupa(@PathVariable("roupaId") Long id){
        roupaService.deleteRoupa(id);
    }

    @PutMapping(path = "{roupaId}")
    public void updateRoupa(@PathVariable("roupaId") Long id,
                              @RequestParam(required = false) String nome,
                              @RequestParam(required = false) String valor,
                              @RequestParam(required = false) String prazo

    ){
        roupaService.updateRoupa(id, nome, valor, prazo);

    }

}
