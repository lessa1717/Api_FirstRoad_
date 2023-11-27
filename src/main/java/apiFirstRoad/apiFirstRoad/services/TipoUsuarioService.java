//package apiFirstRoad.apiFirstRoad.services;
//
//import apiFirstRoad.apiFirstRoad.models.TipoUsuario;
//import apiFirstRoad.apiFirstRoad.repositories.TipoUsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class TipoUsuarioService {
//
//    @Autowired
//    private TipoUsuarioRepository tipoUsuarioRepository;
//
//    public List<TipoUsuario> getAllTipoUsuarios() {
//        return tipoUsuarioRepository.findAll();
//    }
//
//    public TipoUsuario getTipoUsuarioById(UUID id) {
//        return tipoUsuarioRepository.findById(id).orElse(null);
//    }
//
//    public void addTipoUsuario(TipoUsuario tipoUsuario) {
//        tipoUsuarioRepository.save(tipoUsuario);
//    }
//
//
//}
