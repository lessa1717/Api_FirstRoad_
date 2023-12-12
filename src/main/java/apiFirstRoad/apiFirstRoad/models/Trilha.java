package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "tb_trilha")
public class Trilha {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // ou outra estratégia de geração de valor
    private UUID id;

    private String titulo_trilha;
    private String descricao_trilha;
    private Time tempo_trilha;
    private String situacao;
    private UUID id_cargo;
    private UUID id_uo;
    private UUID id_conteudo;
}
