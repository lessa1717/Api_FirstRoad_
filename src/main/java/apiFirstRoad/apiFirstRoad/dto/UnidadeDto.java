package apiFirstRoad.apiFirstRoad.dto;

public record UnidadeDto(
        String idUnidade,
        String razaoSocial,
        String cnpj,
        String logradouro,
        int numero,
        String complemento,
        String bairro,
        String cep
) {}
