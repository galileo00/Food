package com.example.food.API;

import com.example.food.Models.RecipeDetails.DetailsResponse;
import com.example.food.Models.Recipes.RecipeResponse;
import com.example.food.Models.RecipesAuto.RecipesAutoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiCall {

    @Headers("X-RapidAPI-Key: a8990b6e06msh235744a76b47a48p1b8833jsn7c68326d7dea")
    @GET("recipes/autocomplete")
    Call<List<RecipesAutoResponse>> autoCompleteRecipies(@Query("query") String search);


    @Headers("X-RapidAPI-Key: a8990b6e06msh235744a76b47a48p1b8833jsn7c68326d7dea")
    @GET("recipes/search")
    Call<RecipeResponse> searchRecipe(@Query("query") String search);


    @Headers({"X-RapidAPI-Key: a8990b6e06msh235744a76b47a48p1b8833jsn7c68326d7dea"
            , "X-RapidAPI-Host:spoonacular-recipe-food-nutrition-v1.p.rapidapi.com"})
    @GET("recipes/{id}/information")
    Call<DetailsResponse> getFullDetails(@Path("id") int ids);


}
