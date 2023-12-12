package apiFirstRoad.apiFirstRoad.controller;


import apiFirstRoad.apiFirstRoad.dto.TrilhaDto;
import apiFirstRoad.apiFirstRoad.models.Trilha;
import apiFirstRoad.apiFirstRoad.repositories.TrilhaRepository;
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
@RequestMapping(value = "/trilha", produces = {"application/json"})
public class TrilhaController {

    @Autowired
    TrilhaRepository trilhaRepository;

    @GetMapping
    public ResponseEntity<List<Trilha>> listarTrilhas(){
        return ResponseEntity.status(HttpStatus.OK).body(trilhaRepository.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarTipoUsuarioId(@PathVariable(value = "id")UUID id){
        Optional<Trilha> dadoBuscado = trilhaRepository.findById(id);

        if (dadoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Trilha não encontrada");
        }

        return ResponseEntity.status(HttpStatus.OK).body(dadoBuscado.get());
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarTipoUsuario(@org.jetbrains.annotations.NotNull @RequestBody TrilhaDto dadosRecebidos) {
        if (dadosRecebidos.titulo_trilha() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O título da trilha deve ser informado");
        }

        Trilha trilha = new Trilha();
        BeanUtils.copyProperties(dadosRecebidos, trilha);
        return ResponseEntity.status(HttpStatus.CREATED).body(trilhaRepository.save(trilha));
    }


    @PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarTipoUsuario(@PathVariable(value = "id") UUID id, @org.jetbrains.annotations.NotNull @RequestBody TrilhaDto dadosRecebidos) {
        Optional<Trilha> dadoBuscado = trilhaRepository.findById(id);
        if (dadosRecebidos.titulo_trilha() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O título da trilha deve ser informado");
        }else{
            if (dadoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Trilha não encontrada");
            }
        }

        Trilha trilha = dadoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, trilha);
        return ResponseEntity.status(HttpStatus.CREATED).body(trilhaRepository.save(trilha));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarConteudo(@PathVariable(value = "id") UUID id){
        Optional<Trilha> conteudoBuscado = trilhaRepository.findById(id);

        if (conteudoBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Trilha não encontrada");
        }

        trilhaRepository.delete(conteudoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Trilha deletada com sucesso");
    }
}