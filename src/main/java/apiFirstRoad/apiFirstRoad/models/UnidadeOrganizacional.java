package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_unidade_organizacional")
public class UnidadeOrganizacional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUo;

    private String nomeDepartamento;
    private UUID idUsuario;
    private UUID idUnidade;

    public UUID getIdUo() {
        return idUo;
    }

    public void setIdUo(UUID idUo) {
        this.idUo = idUo;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UUID getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(UUID idUnidade) {
        this.idUnidade = idUnidade;
    }
}
