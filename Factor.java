package com.example.t3_v2_prctica;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Factor {
    public static Retrofit build(){

        return new Retrofit.Builder()
                .baseUrl("https://6286232df0e8f0bb7c10f1ad.mockapi.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
