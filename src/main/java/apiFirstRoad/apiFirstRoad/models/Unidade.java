package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_unidades")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    String razao_social;
    String cnpj;
    String logradouro;
    int numero;
    String complemento;
    String bairro;
    String cep;
}