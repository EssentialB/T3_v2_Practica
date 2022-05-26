package com.example.t3_v2_prctica.Entities;

public class Pokemons {
    public int id;
    public int Numero_Pokemon;
    public String Nombre_Pokemon;
    public String Tipo_Pokemon;
    public String Region;

    public Pokemons(int Numero_Pokemon, String Nombre_Pokemon, String Tipo_Pokemon, String Region) {

        this.Numero_Pokemon = Numero_Pokemon;
        this.Nombre_Pokemon = Nombre_Pokemon;
        this.Tipo_Pokemon = Tipo_Pokemon;
        this.Region = Region;
    }
}

