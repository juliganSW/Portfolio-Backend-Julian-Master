package com.ArgProg.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institucion;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private String inicio;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private String fin;
    private String titulo;
    private String imagen;

    public Educacion() {
    }

    public Educacion( Long id,String institucion, String inicio, String fin, String titulo, String imagen) {
        
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.titulo = titulo;
        this.imagen=imagen;
    }

}
