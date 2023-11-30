package apiFirstRoad.apiFirstRoad.repositories;


import apiFirstRoad.apiFirstRoad.models.Usuario;
import apiFirstRoad.apiFirstRoad.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Usuario findByEmail(String email);
}


