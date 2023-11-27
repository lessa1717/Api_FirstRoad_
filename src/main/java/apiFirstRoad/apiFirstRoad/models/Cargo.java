package apiFirstRoad.apiFirstRoad.models;




import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tb_Cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_cargo;


}
