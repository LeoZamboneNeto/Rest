package br.com.aula.restapi.repository;

import br.com.aula.restapi.request.RequestPet;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface PetRepository extends JpaRepository <RequestPet, Integer>{
}
