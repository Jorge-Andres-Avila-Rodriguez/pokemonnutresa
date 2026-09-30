package com.example.models;

import java.util.UUID;



public class Pokemon {
    // --Atributos de la clase Pokemon
    UUID id;
    String nombre;
    Integer cantidadVidas;
    Integer cantidadAtaque;
    Integer cantidadDefensa;
    String tipoPokemon;

    // --Constructor de la clase Pokemon
    public Pokemon(UUID id, String nombre, Integer cantidadVidas, Integer cantidadAtaque, Integer cantidadDefensa, String tipoPokemon) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadVidas = cantidadVidas;
        this.cantidadAtaque = cantidadAtaque;
        this.cantidadDefensa = cantidadDefensa;
        this.tipoPokemon = tipoPokemon;
    }

}
