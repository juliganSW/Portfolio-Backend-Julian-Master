package com.ArgProg.Portfolio.service;

import com.ArgProg.Portfolio.model.Red;
import java.util.List;

public interface IRedService {

    public List<Red> verReds();

    public void crearRed(Red red);

    public void borrarRed(Long id);

    public Red buscarRed(Long id);

    public void editarRed(Red red);

}
