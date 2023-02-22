package com.ArgProg.Portfolio.controller;

import com.ArgProg.Portfolio.model.Educacion;

import com.ArgProg.Portfolio.service.IEducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "https://portfolio-backend-xube.onrender.com")
public class ControllerEducacion {

    @Autowired
    private IEducacionService eduServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Educacion> verEducaciones() {
        return eduServ.verEducaciones();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable Long id) {
        return eduServ.buscarEducacion(id);
    }

    @PostMapping("/new")
    public String agregarEducacion(@RequestBody Educacion ed) {
        eduServ.crearEducacion(ed);
        return "La educacion fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
        return "La educacion fue borrada correctamente";

    }

    @PutMapping("/edit")
    public String editarEducacion(@RequestBody Educacion ed) {
        eduServ.editarEducacion(ed);
        return "La educacion se ha actualizado con exito";
    }
}
