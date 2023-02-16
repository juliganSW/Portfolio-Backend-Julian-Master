package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyectos();

    public void crearProyecto(Proyecto pro);

    public void borrarProyecto(Long id);

    public Proyecto buscarProyecto(Long id);

    public void editarProyecto(Proyecto pro);

}
