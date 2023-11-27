package apiFirstRoad.apiFirstRoad.models;

import java.util.UUID;
import java.sql.Time;

public class Trilha {
    private UUID idTrilha;
    private String tituloTrilha;
    private String descricaoTrilha;
    private Time tempoTrilha;
    private String situacao;
    private UUID idCargo;
    private UUID idUo;
    private UUID idConteudo;


    public UUID getIdTrilha() {
        return idTrilha;
    }

    public void setIdTrilha(UUID idTrilha) {
        this.idTrilha = idTrilha;
    }

    public String getTituloTrilha() {
        return tituloTrilha;
    }

    public void setTituloTrilha(String tituloTrilha) {
        this.tituloTrilha = tituloTrilha;
    }

    public String getDescricaoTrilha() {
        return descricaoTrilha;
    }

    public void setDescricaoTrilha(String descricaoTrilha) {
        this.descricaoTrilha = descricaoTrilha;
    }

    public Time getTempoTrilha() {
        return tempoTrilha;
    }

    public void setTempoTrilha(Time tempoTrilha) {
        this.tempoTrilha = tempoTrilha;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public UUID getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(UUID idCargo) {
        this.idCargo = idCargo;
    }

    public UUID getIdUo() {
        return idUo;
    }

    public void setIdUo(UUID idUo) {
        this.idUo = idUo;
    }

    public UUID getIdConteudo() {
        return idConteudo;
    }

    public void setIdConteudo(UUID idConteudo) {
        this.idConteudo = idConteudo;
    }
}
