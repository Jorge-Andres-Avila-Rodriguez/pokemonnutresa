package com.example;

import java.util.UUID;

public class Auxiliar {
    UUID id;
    String nombre;
    String profesion;
    String ciudad;

    public Auxiliar(UUID id, String nombre, String profesion, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.profesion = profesion;
        this.ciudad = ciudad;
    }
}
