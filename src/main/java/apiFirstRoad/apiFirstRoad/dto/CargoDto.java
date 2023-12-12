package apiFirstRoad.apiFirstRoad.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto(
        @NotBlank String nome_cargo,
        String id
) {}
