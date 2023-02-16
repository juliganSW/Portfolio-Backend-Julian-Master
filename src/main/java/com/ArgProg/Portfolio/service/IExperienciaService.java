package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencias();

    public void crearExperiencia(Experiencia exp);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);

    public void editarExperiencia(Experiencia exp);

}
