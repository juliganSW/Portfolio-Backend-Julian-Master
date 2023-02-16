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
public class Red {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String red;
    private String logo;
    private String url;

    public Red() {
    }

    public Red( Long id, String red, String logo, String url) {
        this.red = red;
        this.logo = logo;
        this.url = url;
    }

}
