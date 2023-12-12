package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "tb_conteudo")
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String titulo_conteudo;
    private String descricao_conteudo;
    private String link;
    private Time tempo_conteudo;


}
