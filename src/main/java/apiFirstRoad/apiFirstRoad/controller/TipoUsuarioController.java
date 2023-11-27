//package apiFirstRoad.apiFirstRoad.controller;
//
//import apiFirstRoad.apiFirstRoad.models.TipoUsuario;
//import apiFirstRoad.apiFirstRoad.services.TipoUsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/tiposusuarios")
//public class TipoUsuarioController {
//
//    @Autowired
//    private TipoUsuarioService tipoUsuarioService;
//
//    @GetMapping
//    public List<TipoUsuario> getAllTipoUsuarios() {
//        return tipoUsuarioService.getAllTipoUsuarios();
//    }
//
//    @GetMapping("/{id}")
//    public TipoUsuario getTipoUsuarioById(@PathVariable UUID id) {
//        return tipoUsuarioService.getTipoUsuarioById(id);
//    }
//
//    @PostMapping
//    public void addTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
//        tipoUsuarioService.addTipoUsuario(tipoUsuario);
//    }
//
//
//}
