package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;
import java.sql.Time;

@Entity
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idConteudo;

    private String tituloConteudo;
    private String descricaoConteudo;
    private String link;
    private Time tempoConteudo;

    public UUID getIdConteudo() {
        return idConteudo;
    }

    public void setIdConteudo(UUID idConteudo) {
        this.idConteudo = idConteudo;
    }

    public String getTituloConteudo() {
        return tituloConteudo;
    }

    public void setTituloConteudo(String tituloConteudo) {
        this.tituloConteudo = tituloConteudo;
    }

    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) {
        this.descricaoConteudo = descricaoConteudo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Time getTempoConteudo() {
        return tempoConteudo;
    }

    public void setTempoConteudo(Time tempoConteudo) {
        this.tempoConteudo = tempoConteudo;
    }
}
