package com.practica01.domain;

import lombok.Data;

@Data
public class Estado {
    private String nombre;
    private String capital;
    private int poblacion;
    private String costas;

    public Estado() {
    }

    public Estado(String nombre, String capital, int poblacion, String costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
    
    
}
