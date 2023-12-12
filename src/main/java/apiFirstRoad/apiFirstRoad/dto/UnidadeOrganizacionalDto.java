package apiFirstRoad.apiFirstRoad.dto;

import java.util.UUID;

public record UnidadeOrganizacionalDto(
        String nome_departamento,
        UUID id_usuario,
        UUID id_unidade
) {}
