package apiFirstRoad.apiFirstRoad.repositories;

import apiFirstRoad.apiFirstRoad.models.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, UUID> {

}
