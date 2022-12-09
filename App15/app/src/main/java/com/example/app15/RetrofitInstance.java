package com.example.app15;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static String BASE_URL ="https://api.covidtracking.com/v1/us/";

    static Gson gson = new GsonBuilder()
            .setLenient().create();

    private static retrofit2.Retrofit retrofit;

    public static retrofit2.Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
