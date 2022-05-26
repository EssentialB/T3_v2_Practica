package com.example.t3_v2_prctica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.t3_v2_prctica.Entities.Pokemons;
import com.example.t3_v2_prctica.Services.PokemonServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);


        Retrofit retrofit = Factor.build();

        PokemonServices service = retrofit.create(PokemonServices.class);

        Call<List<Pokemons>> call = service.create();

        call.enqueue(new Callback<List<Pokemons>>() {
            @Override
            public void onResponse(Call<List<com.example.t3_v2_prctica.Entities.Pokemons>> call, Response<List<Pokemons>> response) {

            }

            @Override
            public void onFailure(Call<List<com.example.t3_v2_prctica.Entities.Pokemons>> call, Throwable t) {

            }
        });
    }

}