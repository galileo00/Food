package com.example.food.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {



    private static Retrofit retrofitInstance;
    private static Retrofit getInstance(){
        if(retrofitInstance==null){//create
            retrofitInstance = new Retrofit.Builder()
                    .baseUrl("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitInstance;
    }

    public static ApiCall getAPIs(){
        ApiCall services = getInstance().create(ApiCall.class);
        return services;
    }
}
