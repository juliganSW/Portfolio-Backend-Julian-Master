package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Experiencia;
import com.ArgProg.Portfolio.repository.ExperienciaRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();

    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);

    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);

    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);

    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        expeRepo.save(exp);

    }

}
