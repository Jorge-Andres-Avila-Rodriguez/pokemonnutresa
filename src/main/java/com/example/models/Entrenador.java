package com.example.models;

import java.util.UUID;

public class Entrenador {
    UUID id;
    String nombre;
    String ciudadOrigen;
    Integer edad;

    public Entrenador(UUID id, String nombre, String ciudadOrigen, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.edad = edad;
    }
}
