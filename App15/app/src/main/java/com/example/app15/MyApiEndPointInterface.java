package com.example.app15;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApiEndPointInterface {


    @GET("daily.json")
    Call<List<Example>> getExample();
}
