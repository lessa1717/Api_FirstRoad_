package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.dto.ConteudoDto;
import apiFirstRoad.apiFirstRoad.models.Conteudo;
import apiFirstRoad.apiFirstRoad.repositories.ConteudoRepository;
import apiFirstRoad.apiFirstRoad.services.ConteudoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/conteudo", produces = {"application/json"})
public class ConteudoController {

    @Autowired
    ConteudoRepository conteudoRepository;

    @Autowired
    ConteudoService conteudoService;

    @GetMapping
    public ResponseEntity<List<Conteudo>> listarConteudo(){
        return ResponseEntity.status(HttpStatus.OK).body(conteudoRepository.findAll());
    }


    @GetMapping("/{idConteudo}")
    public ResponseEntity<Object> buscarUsuarioId(@PathVariable(value = "idConteudo")UUID id){
        Optional<Conteudo> conteudoBuscado = conteudoRepository.findById(id);

        if (conteudoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conteúdo não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(conteudoBuscado.get());
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarConteudo(@org.jetbrains.annotations.NotNull @RequestBody ConteudoDto dadosRecebidos) {
            if (dadosRecebidos.titulo_conteudo() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O conteudo deve ser informado");
        }

        Conteudo conteudo = new Conteudo();
        BeanUtils.copyProperties(dadosRecebidos, conteudo);
        return ResponseEntity.status(HttpStatus.CREATED).body(conteudoRepository.save(conteudo));
    }


    @PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarConteudo(@PathVariable(value = "id") UUID id, @org.jetbrains.annotations.NotNull @RequestBody ConteudoDto dadosRecebidos) {
        Optional<Conteudo> dadoBuscado = conteudoRepository.findById(id);
        if (dadosRecebidos.titulo_conteudo() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Conteudo deve ser informado");
        }else{
            if (dadoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conteudo não encontrado");
            }
        }

        Conteudo conteudo = dadoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, conteudo);
        return ResponseEntity.status(HttpStatus.CREATED).body(conteudoRepository.save(conteudo));
    }


    @DeleteMapping("/{idConteudo}")
    public ResponseEntity<Object> deletarConteudo(@PathVariable(value = "idConteudo") UUID id){
        Optional<Conteudo> conteudoBuscado = conteudoRepository.findById(id);

        if (conteudoBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conteudo não encontrado");
        }

        conteudoRepository.delete(conteudoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Conteudo deletado com sucesso");
    }
}