package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> verEducaciones();

    public void crearEducacion(Educacion ed);

    public void borrarEducacion(Long id);

    public Educacion buscarEducacion(Long id);

    public void editarEducacion(Educacion ed);

}
