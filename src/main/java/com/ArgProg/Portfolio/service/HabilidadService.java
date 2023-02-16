package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Habilidad;

import com.ArgProg.Portfolio.repository.HabilidadRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadService implements IHabilidadService {

    @Autowired
    public HabilidadRepository habiRepo;

    @Override
    public List<Habilidad> verHabilidades() {
        return habiRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habiRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habiRepo.findById(id).orElse(null);
    }
    
   @Override
    public void editarHabilidad(Habilidad hab) {
       habiRepo.save(hab);
    }

}
