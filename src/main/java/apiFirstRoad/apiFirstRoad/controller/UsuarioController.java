package apiFirstRoad.apiFirstRoad.controller;


import apiFirstRoad.apiFirstRoad.models.UsuarioModel;
import apiFirstRoad.apiFirstRoad.repositories.UsuarioRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuarios", produces = {"application/json"})
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listarUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());

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

