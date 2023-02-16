package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Persona;
import com.ArgProg.Portfolio.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }
   
    // Login
    @Override
    public Persona loginPersona(String email, String password){
     List<Persona> personas= persoRepo.findByEmailAndPassword(email, password);
     if(!personas.isEmpty()){
     return personas.get( 0);
     
     }
        return null;
    
    }
}
    
   
    


