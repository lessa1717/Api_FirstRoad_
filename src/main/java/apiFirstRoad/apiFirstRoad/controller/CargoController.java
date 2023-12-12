package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.dto.CargoDto;
import apiFirstRoad.apiFirstRoad.models.Cargo;
import apiFirstRoad.apiFirstRoad.repositories.CargoRepository;
import apiFirstRoad.apiFirstRoad.services.CargoService;
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
@RequestMapping(value = "/cargos", produces = {"application/json"})
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping
    @ResponseBody
    public List<Cargo> getAllCargos() {
        return cargoService.getAllCargos();
    }

    @GetMapping("/{id}")
    public Cargo getCargoById(@PathVariable UUID id) {
        return cargoService.getCargoById(id);
    }


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> cadastrarCargo(@org.jetbrains.annotations.NotNull @RequestBody CargoDto dadosRecebidos) {
            if (dadosRecebidos.nome_cargo() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Cargo deve ser informado");
        }

        Cargo cargo = new Cargo();
        BeanUtils.copyProperties(dadosRecebidos, cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoRepository.save(cargo));
    }


    @PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Object> editarCargo(@PathVariable(value = "id") UUID id, @org.jetbrains.annotations.NotNull @RequestBody CargoDto dadosRecebidos) {
        Optional<Cargo> cargoBuscado = cargoRepository.findById(id);
        if (dadosRecebidos.nome_cargo() == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O Cargo deve ser informado");
        }else{
            if (cargoBuscado.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado");
            }
        }

        Cargo cargo = cargoBuscado.get();
        BeanUtils.copyProperties(dadosRecebidos, cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoRepository.save(cargo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarCargo(@PathVariable(value = "id") UUID id){

        Optional<Cargo> cargo = cargoRepository.findById(id);

        if (cargo.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado");
        }

        cargoRepository.delete(cargo.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cargo deletado com sucesso");
    }

}
