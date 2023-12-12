package apiFirstRoad.apiFirstRoad.repositories;

import apiFirstRoad.apiFirstRoad.models.Trilha;
import apiFirstRoad.apiFirstRoad.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TrilhaRepository extends JpaRepository<Trilha, UUID> {

}
