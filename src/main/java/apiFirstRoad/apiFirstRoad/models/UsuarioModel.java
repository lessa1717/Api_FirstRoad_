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
@Table(name = "tb_Usuarios")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    //    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Id_usuario", nullable = false)
//    private UUID id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_usuario", nullable = false)
    private Long id;
    private String nomeUsuario;
    private String senha;
    private Date dataNascimento;
    private String email;
    private String tipo_usuario;
    private String url_img;

}