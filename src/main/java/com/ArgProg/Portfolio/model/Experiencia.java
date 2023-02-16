
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;
    private String puesto;
    private String tareas;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private String inicio;
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private String fin;
    private String logo;

    public Experiencia() {
    }

    public Experiencia( String empresa, String puesto, String tareas, String inicio, String fin, String logo) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.tareas = tareas;
        this.inicio = inicio;
        this.fin = fin;
        this.logo=logo;
    }
    
    
    
    
    
    
}
