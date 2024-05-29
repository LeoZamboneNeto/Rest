package br.com.aula.restapi.controller;

import br.com.aula.restapi.request.RequestPet;
import br.com.aula.restapi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Pet")

public class PetController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public void cadastroPet(@RequestBody RequestPet Pet) {
        System.out.println("Nome: " + Pet.getNome());
        System.out.println("CPF: " + Pet.getCPF());
        System.out.println("Telefone: " + Pet.getTelefone());

        service.save(Pet);

    }

    @Autowired
    private PetService service;

    @GetMapping
    public List<RequestPet> findall () {

        return service.findall();
    }
}
