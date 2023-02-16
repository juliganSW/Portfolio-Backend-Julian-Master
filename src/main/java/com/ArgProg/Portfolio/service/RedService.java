
package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Red;

import com.ArgProg.Portfolio.repository.RedRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RedService implements IRedService {
    
      @Autowired
    public RedRepository redsRepo;

    @Override
    public List<Red> verReds() {
        return redsRepo.findAll();
    }

    @Override
    public void crearRed(Red red) {
        redsRepo.save(red);
    }

    @Override
    public void borrarRed(Long id) {
        redsRepo.deleteById(id);
    }

    @Override
    public Red buscarRed(Long id) {
     return   redsRepo.findById(id).orElse(null);
    }

    @Override
    public void editarRed(Red red) {
        redsRepo.save(red);
    }
    
    
    
}
