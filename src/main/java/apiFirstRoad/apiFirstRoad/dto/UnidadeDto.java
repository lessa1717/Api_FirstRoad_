package apiFirstRoad.apiFirstRoad.dto;

public record UnidadeDto(
        String razao_social,
        String cnpj,
        String logradouro,
        int numero,
        String complemento,
        String bairro,
        String cep
) {}
