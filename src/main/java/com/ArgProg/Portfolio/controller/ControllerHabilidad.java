package com.ArgProg.Portfolio.controller;

import com.ArgProg.Portfolio.model.Habilidad;

import com.ArgProg.Portfolio.service.IHabilidadService;

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
@RequestMapping("habilidad")
@CrossOrigin(origins = "https://portfolio-backend-xube.onrender.com")
public class ControllerHabilidad {

    @Autowired
    private IHabilidadService habiServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return habiServ.verHabilidades();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable Long id) {
        return habiServ.buscarHabilidad(id);
    }

    @PostMapping("/new")
    public String agregarHabilidad(@RequestBody Habilidad hab) {
        habiServ.crearHabilidad(hab);
        return "La habilidad fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarHabilidad(@PathVariable Long id) {
        habiServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }

    /* @PutMapping("/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
            @RequestParam("habilidad") String nuevaHabilidad,
            @RequestParam("progreso") int nuevoProgreso,
            @RequestParam("logo") String nuevoLogo,
            @RequestParam("url") String nuevaUrl) {

        Habilidad habi = habiServ.buscarHabilidad(id);

        habi.setHabilidad(nuevaHabilidad);
        habi.setProgreso(nuevoProgreso);
        habi.setLogo(nuevoLogo);
        habi.setUrl(nuevaUrl);
        habiServ.crearHabilidad(habi);
        return habi;
    }*/
    @PutMapping("/edit")
    public String editarHabilidad(@RequestBody Habilidad hab) {
        habiServ.editarHabilidad(hab);
        return "La habilidad se ha actualizado con exito";
    }
}
