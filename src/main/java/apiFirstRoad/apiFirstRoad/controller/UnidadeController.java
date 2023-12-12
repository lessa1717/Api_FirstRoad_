package apiFirstRoad.apiFirstRoad.controller;


import apiFirstRoad.apiFirstRoad.dto.UnidadeDto;
import apiFirstRoad.apiFirstRoad.models.Unidade;
import apiFirstRoad.apiFirstRoad.repositories.UnidadeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/unidades", produces = {"application/json"})
public class UnidadeController {

    @Autowired
    UnidadeRepository unidadeRepository;

    @GetMapping
    public ResponseEntity<List<Unidade>> listarUnidades(){
        return ResponseEntity.status(HttpStatus.OK).body(unidadeRepository.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarUnidadeId(@PathVariable(value = "id")UUID id){
        Optional<Unidade> dadoBuscado = unidadeRepository.findById(id);

        if (dadoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade não encontrada");
        }

        return ResponseEntity.status(HttpStatus.OK).body(dadoBuscado.get());
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarUnidade(@org.jetbrains.annotations.NotNull @RequestBody UnidadeDto dadosRecebidos) {
            if (dadosRecebidos.razao_social() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A Unidade deve deve ser informado");
        }

        Unidade unidade = new Unidade();
        BeanUtils.copyProperties(dadosRecebidos, unidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(unidadeRepository.save(unidade));
    }


    @PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarTipoUsuario(@PathVariable(value = "id") UUID id, @org.jetbrains.annotations.NotNull @RequestBody UnidadeDto dadosRecebidos) {
        Optional<Unidade> dadoBuscado = unidadeRepository.findById(id);
        if (dadosRecebidos.razao_social() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A Razão Social da Unidade deve ser informado");
        }else{
            if (dadoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade não encontrada");
            }
        }

        Unidade unidade = dadoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, unidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(unidadeRepository.save(unidade));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarConteudo(@PathVariable(value = "id") UUID id){
        Optional<Unidade> conteudoBuscado = unidadeRepository.findById(id);

        if (conteudoBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade não encontrada");
        }

        unidadeRepository.delete(conteudoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Unidade deletada com sucesso");
    }
}