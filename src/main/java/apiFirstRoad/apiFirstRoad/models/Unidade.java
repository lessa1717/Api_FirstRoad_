package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tb_Unidades")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_unidade;


}
