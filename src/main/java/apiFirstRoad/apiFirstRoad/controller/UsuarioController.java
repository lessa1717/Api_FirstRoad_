package apiFirstRoad.apiFirstRoad.controller;


import apiFirstRoad.apiFirstRoad.dto.UsuarioDto;

import apiFirstRoad.apiFirstRoad.models.UsuarioModel;
import apiFirstRoad.apiFirstRoad.repositories.UsuarioRepository;
import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuarios", produces = {"application/json"})
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listarUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }

    @GetMapping("/{Id_usuario}")
    public ResponseEntity<Object> buscarUsuarioId(@PathVariable(value = "idUsuario")UUID id){
        Optional<UsuarioModel> usuarioBuscado = usuarioRepository.findById(id);

        if (usuarioBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(usuarioBuscado.get());
    }

    @RequestMapping
    @PostMapping
    //RequestBody e @Valid é para receber os dados do dto que foi colocado como notblank
    public ResponseEntity<Object> criarUsuario(@RequestBody @Valid UsuarioDto usuarioDto){
        if (usuarioRepository.findByEmail(usuarioDto.email()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email já cadastrado no sistema");
        }


        UsuarioModel usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);


        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuarioModel));

    }

}
//    @Autowired
//    public UsuarioController(UsuarioRepository usuarioRepository) {
//        this.usuarioRepository = usuarioRepository;
//    }

//    @GetMapping
//    public List<Usuario> listarUsuarios() {
//        return usuarioRepository.findAll();
//    }

