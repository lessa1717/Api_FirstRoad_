package apiFirstRoad.apiFirstRoad.services;

import apiFirstRoad.apiFirstRoad.models.Unidade;
import apiFirstRoad.apiFirstRoad.repositories.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UnidadeService {

    @Autowired
    private UnidadeRepository unidadeRepository;

    public List<Unidade> getAllUnidades() {
        return unidadeRepository.findAll();
    }

    public Unidade getUnidadeById(UUID id) {
        return unidadeRepository.findById(id).orElse(null);
    }

    public void addUnidade(Unidade unidade) {
        unidadeRepository.save(unidade);
    }


}
