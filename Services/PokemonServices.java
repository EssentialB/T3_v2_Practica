package com.example.t3_v2_prctica.Services;

import com.example.t3_v2_prctica.Entities.Pokemons;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PokemonServices {
    @POST("Pokemons")
    Call<Pokemons> create(@Body Pokemons Pokemons);
}
