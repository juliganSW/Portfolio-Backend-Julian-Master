package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Educacion;
import com.ArgProg.Portfolio.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion ed) {
        eduRepo.save(ed);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion ed) {
        eduRepo.save(ed);
    }

}
