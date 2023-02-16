package com.ArgProg.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proyecto;
    @Lob
    private String descripcion;
   //@Size(max=100)
    private String imagen;
    

    public Proyecto() {
    }

    public Proyecto( String proyecto, String descripcion, String imagen ) {
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.imagen = imagen;
       
       
        
    }

}
