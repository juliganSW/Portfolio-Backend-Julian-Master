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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String titulo;
     private String acercademi;
    private String imagen;
    @Lob
    private String email;
    private String password;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, int edad, String titulo, String acercademi, String imagen, String email, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.titulo=titulo;
        this.imagen=acercademi;
        this.acercademi = imagen;
        this.password=email;
        this.email=password;
    }

}
