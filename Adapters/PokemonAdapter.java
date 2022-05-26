package com.example.t3_v2_prctica.Adapters;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3_v2_prctica.Entities.Pokemons;
import com.example.t3_v2_prctica.R;
import com.google.gson.Gson;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {
    List<Pokemons> pokemons;
    public PokemonAdapter(List<Pokemons> pokemons) {
        this.pokemons = pokemons;
    }
    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder vh, int position) {
        View itemView = vh.itemView;
        Pokemons pokemon = pokemons.get(position);
        EditText etNumber = itemView.findViewById(R.id.etNumero);
        TextView tvNombre = itemView.findViewById(R.id.tvNombre);
        TextView tvTipo = itemView.findViewById(R.id.tvTipo);
        TextView tvRegion = itemView.findViewById(R.id.tvRegion);

        etNumber.setText(pokemon.Numero_Pokemon);
        tvNombre.setText(pokemon.Nombre_Pokemon);
        tvTipo.setText(pokemon.Tipo_Pokemon);
        tvRegion.setText(pokemon.Region);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}