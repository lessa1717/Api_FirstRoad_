package apiFirstRoad.apiFirstRoad.models;

import java.util.UUID;

public class UnidadeOrganizacional {
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
