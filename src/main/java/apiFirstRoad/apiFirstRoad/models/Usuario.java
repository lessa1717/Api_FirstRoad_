package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tb_Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "Id_tipoUsuario")
    private TipoUsuario tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "Id_unidade")
    private Unidade unidade;






















































    @ManyToOne
    @JoinColumn(name = "Id_cargo")
    private Cargo cargo;


}
