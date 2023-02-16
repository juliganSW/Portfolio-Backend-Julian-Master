package com.ArgProg.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidad;
      //@Min(0)
     //@Max(100)
    private int progreso;
    private String logo;
    private String url;

    public Habilidad() {
    }

    public Habilidad( String habilidad, int progreso, String logo, String url) {
        this.habilidad = habilidad;
        this.progreso = progreso;
        this.logo = logo;
        this.url = url;
    }

}
