package com.ArgProg.Portfolio.controller;

import com.ArgProg.Portfolio.model.Persona;
import com.ArgProg.Portfolio.service.IPersonaService;
import jakarta.persistence.Table;

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
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "https://portfolio-backend-xube.onrender.com")
@Table(name = "persona")

public class ControllerPersona {

    @Autowired
    private IPersonaService persoServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }

    @PostMapping("/new")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }

    @PutMapping("/edit")
    public String editartPersona(@RequestBody Persona per) {
        persoServ.editarPersona(per);
        return "la persona se ha actualizado con exito";
    }
    //para Login   

    @PostMapping("/autenticacion/inicio")
    public Persona loginPersona(@RequestBody Persona pers) {
        return persoServ.loginPersona(pers.getEmail(), pers.getPassword());
    }

}
