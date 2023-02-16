package com.ArgProg.Portfolio.controller;


import com.ArgProg.Portfolio.model.Red;
import com.ArgProg.Portfolio.service.IRedService;
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
@RequestMapping("red")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerRed {

    @Autowired
    private IRedService redsServ;

    @GetMapping("/view")
    @ResponseBody
    public List<Red> verReds() {
        return redsServ.verReds();
    }

    @GetMapping("/view/{id}")
    @ResponseBody
    public Red verRed(@PathVariable Long id) {
        return redsServ.buscarRed(id);
    }

    @PostMapping("/new")
    public String agregarRed(@RequestBody Red red) {
        redsServ.crearRed(red);
        return "La red fue creada correctamente";
    }

    @DeleteMapping("/delete/{id}")
    public String borrarRed(@PathVariable Long id) {
        redsServ.borrarRed(id);
        return "La red fue borrada correctamente";
    }

    @PutMapping("/edit")
    public String editartRed(@RequestBody Red red) {
        redsServ.editarRed(red);
        return "la red se ha actualizado con exito";
    }

}
