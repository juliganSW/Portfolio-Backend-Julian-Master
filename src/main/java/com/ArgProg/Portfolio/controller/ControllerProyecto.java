package com.ArgProg.Portfolio.controller;

import com.ArgProg.Portfolio.model.Proyecto;

import com.ArgProg.Portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proyecto")
@CrossOrigin(origins = "https://portfolio-backend-xube.onrender.com")

public class ControllerProyecto {

    @Autowired
    private IProyectoService proyeServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyeServ.verProyectos();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable Long id) {
        return proyeServ.buscarProyecto(id);
    }

    @PostMapping("/new")
    public String agregarProyecto(@RequestBody Proyecto pro) {
        proyeServ.crearProyecto(pro);
        return "El proyecto fue creado correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarProyecto(@PathVariable Long id) {
        proyeServ.borrarProyecto(id);
        return "El Proyecto fue borrado correctamente";
    }

    @PutMapping("/edit")
    public String editartProyecto(@RequestBody Proyecto pro) {
        proyeServ.editarProyecto(pro);
        return "El proyecto ha actualizado con exito";
    }

}
