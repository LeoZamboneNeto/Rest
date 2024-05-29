package br.com.aula.restapi.service;

import br.com.aula.restapi.repository.PetRepository;
import br.com.aula.restapi.request.RequestPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PetService {
    @Autowired
    private AlunoRepository repository;
    public void save(RequestPet Pet) {
        repository.save(Pet);

    }
    public List<RequestPet> findall (){
        return repository.findAll();

    }

}
