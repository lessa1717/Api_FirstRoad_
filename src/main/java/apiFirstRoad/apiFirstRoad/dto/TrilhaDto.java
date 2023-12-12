package apiFirstRoad.apiFirstRoad.dto;

import java.sql.Time;
import java.util.UUID;

public record TrilhaDto(
        String id,
        String titulo_trilha,
        String descricao_trilha,
        Time tempo_trilha,
        String situacao,
        UUID id_cargo,
        UUID id_uo,
        UUID id_conteudo
) {}
