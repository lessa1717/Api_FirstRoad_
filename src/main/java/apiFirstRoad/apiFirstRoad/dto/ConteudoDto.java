package apiFirstRoad.apiFirstRoad.dto;

import jakarta.validation.constraints.NotBlank;

import java.sql.Time;
import java.util.UUID;

public record ConteudoDto(
        @NotBlank String titulo_conteudo,
        String descricao_conteudo,
        String link,
        Time tempo_conteudo
) {}
