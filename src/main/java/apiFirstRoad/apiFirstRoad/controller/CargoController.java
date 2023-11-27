package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.models.Cargo;
import apiFirstRoad.apiFirstRoad.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @GetMapping
    public List<Cargo> getAllCargos() {
        return cargoService.getAllCargos();
    }

    @GetMapping("/{id}")
    public Cargo getCargoById(@PathVariable UUID id) {
        return cargoService.getCargoById(id);
    }

    @PostMapping
    public void addCargo(@RequestBody Cargo cargo) {
        cargoService.addCargo(cargo);
    }


}
