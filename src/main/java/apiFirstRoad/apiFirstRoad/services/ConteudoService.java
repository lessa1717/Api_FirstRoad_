package apiFirstRoad.apiFirstRoad.services;

import apiFirstRoad.apiFirstRoad.models.Cargo;
import apiFirstRoad.apiFirstRoad.models.Conteudo;
import apiFirstRoad.apiFirstRoad.repositories.CargoRepository;
import apiFirstRoad.apiFirstRoad.repositories.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ConteudoService {

    @Autowired
    private ConteudoRepository conteudoRepository;

    public List<Conteudo> getAllConteudo() {
        return conteudoRepository.findAll();
    }

    public Conteudo getConteudoById(UUID id) {
        return conteudoRepository.findById(id).orElse(null);
    }

    public void addConteudo(Conteudo conteudo) {
        conteudoRepository.save(conteudo);
    }

}
