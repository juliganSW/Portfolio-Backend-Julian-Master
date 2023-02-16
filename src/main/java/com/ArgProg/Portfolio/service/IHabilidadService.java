package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Habilidad;
import java.util.List;

public interface IHabilidadService {

    public List<Habilidad> verHabilidades();

    public void crearHabilidad(Habilidad hab);

    public void borrarHabilidad(Long id);

    public Habilidad buscarHabilidad(Long id);

    public void editarHabilidad(Habilidad hab);

}
