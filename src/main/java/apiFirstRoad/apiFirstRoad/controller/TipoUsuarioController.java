package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.dto.TipoUsuarioDto;
import apiFirstRoad.apiFirstRoad.models.TipoUsuario;
import apiFirstRoad.apiFirstRoad.repositories.TipoUsuarioRepository;
import apiFirstRoad.apiFirstRoad.services.TipoUsuarioService;
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
@RequestMapping(value = "/tiposusuarios", produces = {"application/json"})
public class TipoUsuarioController {

    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @Autowired
    TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public ResponseEntity<List<TipoUsuario>> listarTipoUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(tipoUsuarioRepository.findAll());
    }


    @GetMapping("/{idTipoUsuario}")
    public ResponseEntity<Object> buscarTipoUsuarioId(@PathVariable(value = "idTipoUsuario")UUID id){
        Optional<TipoUsuario> dadoBuscado = tipoUsuarioRepository.findById(id);

        if (dadoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tipo de Usuário não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(dadoBuscado.get());
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarTipoUsuario(@org.jetbrains.annotations.NotNull @RequestBody TipoUsuarioDto dadosRecebidos) {
            if (dadosRecebidos.titulo_tipo_usuario() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Tipo de Usuário deve ser informado");
        }

        TipoUsuario tipoUsuario = new TipoUsuario();
        BeanUtils.copyProperties(dadosRecebidos, tipoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoUsuarioRepository.save(tipoUsuario));
    }


    @PutMapping(value = "/{idTipoUsuario}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarTipoUsuario(@PathVariable(value = "idTipoUsuario") UUID id, @org.jetbrains.annotations.NotNull @RequestBody TipoUsuarioDto dadosRecebidos) {
        Optional<TipoUsuario> dadoBuscado = tipoUsuarioRepository.findById(id);
        if (dadosRecebidos.titulo_tipo_usuario() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Tipo de Usuário deve ser informado");
        }else{
            if (dadoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tipo de Usuário não encontrado");
            }
        }

        TipoUsuario tipoUsuario = dadoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, tipoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoUsuarioRepository.save(tipoUsuario));
    }


    @DeleteMapping("/{idTipoUsuario}")
    public ResponseEntity<Object> deletarConteudo(@PathVariable(value = "idTipoUsuario") UUID id){
        Optional<TipoUsuario> conteudoBuscado = tipoUsuarioRepository.findById(id);

        if (conteudoBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tipo de Usuário não encontrado");
        }

        tipoUsuarioRepository.delete(conteudoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Tipo de Usuário deletado com sucesso");
    }
}