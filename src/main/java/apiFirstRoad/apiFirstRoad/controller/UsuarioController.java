package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.models.Usuario;
import apiFirstRoad.apiFirstRoad.repositories.UsuarioRepository;
import apiFirstRoad.apiFirstRoad.dto.UsuarioDto;
import apiFirstRoad.apiFirstRoad.services.FileUploadService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuarios", produces = {"application/json"})
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    FileUploadService fileUploadService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }


    @GetMapping("/{idUsuario}")
    public ResponseEntity<Object> buscarUsuarioId(@PathVariable(value = "idUsuario")UUID id){
        Optional<Usuario> usuarioBuscado = usuarioRepository.findById(id);

        if (usuarioBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }

        return ResponseEntity.status(HttpStatus.OK).body(usuarioBuscado.get());
    }


    @PostMapping
    public ResponseEntity<Object> cadastrarUsuario(@ModelAttribute @Valid UsuarioDto dadosRecebidos){
        if (usuarioRepository.findByEmail(dadosRecebidos.email()) != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email já cadastrado");
        }

        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(dadosRecebidos, usuario);
        String urlImg;

        try{
            urlImg = fileUploadService.fazerUpload(dadosRecebidos.url_imagem());

        }catch (IOException e){
            throw new RuntimeException(e);
        }
        usuario.setUrlimagem(urlImg);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
    }


    @PutMapping(value = "/{idUsuario}", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Object> editarUsuario(@PathVariable(value = "idUsuario") UUID id, @ModelAttribute @Valid UsuarioDto usuarioDto){
        Optional<Usuario> usuarioBuscado = usuarioRepository.findById(id);

        if (usuarioBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }

        Usuario usuario = usuarioBuscado.get();
        BeanUtils.copyProperties(usuarioDto, usuario);


        String urlImg;

        try{
            urlImg = fileUploadService.fazerUpload(usuarioDto.url_imagem());

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        usuario.setUrlimagem(urlImg);

        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));
    }


    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Object> deletarUsuario(@PathVariable(value = "idUsuario") UUID id){
        Optional<Usuario> usuarioBuscado = usuarioRepository.findById(id);

        if (usuarioBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }

        usuarioRepository.delete(usuarioBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado com sucesso");
    }
}