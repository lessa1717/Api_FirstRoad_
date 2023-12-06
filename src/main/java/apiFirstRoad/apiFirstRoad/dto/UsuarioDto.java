package apiFirstRoad.apiFirstRoad.dto;

import apiFirstRoad.apiFirstRoad.models.TipoUsuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

public record UsuarioDto(
        String Id_usuario,
        @NotBlank String nomeUsuario,

        @NotBlank @Email(message = "O email deve estar no formato válido") String email,

        @NotBlank String senha,

        String nif,

        String dataNascimento,

        String Id_tipoUsuario,

        String Id_unidade,

        String Id_cargo,

        MultipartFile imagem
) {
}



