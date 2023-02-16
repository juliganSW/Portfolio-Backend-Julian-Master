
package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Proyecto;
import com.ArgProg.Portfolio.repository.ProyectoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService {
 @Autowired
    public ProyectoRepository proyeRepo; 
    @Override
    public List<Proyecto> verProyectos() {
         return   proyeRepo.findAll();
       
    }

    @Override
    public void crearProyecto(Proyecto pro) {
         proyeRepo.save(pro);
        
    }

    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
       
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
         return proyeRepo.findById(id).orElse(null);
        
    }
    
    @Override
    public void editarProyecto(Proyecto pro) {
        proyeRepo.save(pro);

   
    }
}
    
    
    

