package apiFirstRoad.apiFirstRoad.dto;
public record TrilhaDto(
        String idTrilha,
        String tituloTrilha,
        String descricaoTrilha,
        String tempoTrilha,
        String situacao,
        String idCargo,
        String idUO,
        String idConteudo
) {}
