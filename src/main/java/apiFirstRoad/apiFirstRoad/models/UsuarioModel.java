package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_Usuarios")
public class UsuarioModel implements Serializable {
    @Serial
    private  static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_usuario", nullable = false)
    private UUID id;

    private String nome;

    private String senha;

    private String endereco;

    private String cep;

    private String tipo_usuario;

    private String url_img;

}