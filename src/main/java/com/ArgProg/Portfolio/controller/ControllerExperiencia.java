package com.ArgProg.Portfolio.controller;

import com.ArgProg.Portfolio.model.Experiencia;

import com.ArgProg.Portfolio.service.IExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerExperiencia {

    @Autowired
    private IExperienciaService expeServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expeServ.verExperiencias();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable Long id) {
        return expeServ.buscarExperiencia(id);
    }

    @PostMapping("/new")
    public String agregarExperiencia(@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }

    @PutMapping("/edit")
    public String editarExperiencia(@RequestBody Experiencia exp) {
        expeServ.editarExperiencia(exp);
        return "La experiencia se ha actualizado con exito";
    }

}
