package com.ArgProg.Portfolio.repository;

import com.ArgProg.Portfolio.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {


//Para el Login
public List<Persona> findByEmailAndPassword(String email, String password);
}