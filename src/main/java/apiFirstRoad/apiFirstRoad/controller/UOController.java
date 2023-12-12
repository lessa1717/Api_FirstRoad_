package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.dto.UnidadeOrganizacionalDto;
import apiFirstRoad.apiFirstRoad.models.UnidadeOrganizacional;
import apiFirstRoad.apiFirstRoad.repositories.UnidadeOrganizacionalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/unidades-organizacionais", produces = {"application/json"})
public class UOController {

    @Autowired
    UnidadeOrganizacionalRepository uoRepository;

    @GetMapping
    public ResponseEntity<List<UnidadeOrganizacional>> listarUnidades(){
        return ResponseEntity.status(HttpStatus.OK).body(uoRepository.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarUnidadeId(@PathVariable(value = "id")UUID id){
        Optional<UnidadeOrganizacional> dadoBuscado = uoRepository.findById(id);

        if (dadoBuscado.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade Organizacional não encontrada");
        }

        return ResponseEntity.status(HttpStatus.OK).body(dadoBuscado.get());
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarUnidade(@org.jetbrains.annotations.NotNull @RequestBody UnidadeOrganizacionalDto dadosRecebidos) {
            if (dadosRecebidos.nome_departamento() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nome do departamento deve deve ser informado");
        }

        UnidadeOrganizacional uo = new UnidadeOrganizacional();
        BeanUtils.copyProperties(dadosRecebidos, uo);
        return ResponseEntity.status(HttpStatus.CREATED).body(uoRepository.save(uo));
    }


    @PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarTipoUsuario(@PathVariable(value = "id") UUID id, @org.jetbrains.annotations.NotNull @RequestBody UnidadeOrganizacionalDto dadosRecebidos) {
        Optional<UnidadeOrganizacional> dadoBuscado = uoRepository.findById(id);
        if (dadosRecebidos.nome_departamento() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nome do departamento da Unidade Organizacional deve ser informado");
        }else{
            if (dadoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade Organizacional não encontrada");
            }
        }

        UnidadeOrganizacional uo = dadoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, uo);
        return ResponseEntity.status(HttpStatus.CREATED).body(uoRepository.save(uo));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarConteudo(@PathVariable(value = "id") UUID id){
        Optional<UnidadeOrganizacional> conteudoBuscado = uoRepository.findById(id);

        if (conteudoBuscado.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Unidade não encontrada");
        }

        uoRepository.delete(conteudoBuscado.get());
        return ResponseEntity.status(HttpStatus.OK).body("Unidade deletada com sucesso");
    }
}