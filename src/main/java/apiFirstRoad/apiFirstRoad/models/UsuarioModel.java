package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "Id_usuario", nullable = false)
    private UUID id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long Id_usuario;
    private String nomeUsuario;
    private String senha;
    private Date dataNascimento;
    private String email;
    private String Id_tipoUsuario;
    private String Id_unidade;
    private String Id_cargo;
    private String url_img;

}