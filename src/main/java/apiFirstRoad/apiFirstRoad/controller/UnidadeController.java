package apiFirstRoad.apiFirstRoad.controller;

import apiFirstRoad.apiFirstRoad.models.Unidade;
import apiFirstRoad.apiFirstRoad.services.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/unidades")
public class UnidadeController {

    @Autowired
    private UnidadeService unidadeService;

    @GetMapping
    public List<Unidade> getAllUnidades() {
        return unidadeService.getAllUnidades();
    }

    @GetMapping("/{id}")
    public Unidade getUnidadeById(@PathVariable UUID id) {
        return unidadeService.getUnidadeById(id);
    }

    @PostMapping
    public void addUnidade(@RequestBody Unidade unidade) {
        unidadeService.addUnidade(unidade);
    }

}
