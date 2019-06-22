package com.example.food.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.food.API.ApiManager;
import com.example.food.Models.RecipeDetails.DetailsResponse;
import com.example.food.Models.Recipes.RecipeResponse;
import com.example.food.Models.Recipes.ResultsItem;
import com.example.food.Models.RecipesAuto.RecipesAutoResponse;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecipeViewModel extends AndroidViewModel {


    MutableLiveData<List<RecipesAutoResponse>> recipesLiveData;
    MutableLiveData<RecipeResponse> detailsRecipeLiveData;
    MutableLiveData<DetailsResponse> currentRecipeDetails;
    MutableLiveData<String> erorrLiveData;

    public MutableLiveData<DetailsResponse> getCurrentRecipeDetails() {
        return currentRecipeDetails;
    }

    public MutableLiveData<RecipeResponse> getDetailsRecipeLiveData() {
        return detailsRecipeLiveData;
    }

    public MutableLiveData<List<RecipesAutoResponse>> getRecipesLiveData() {
        return recipesLiveData;
    }

    public MutableLiveData<String> getErorrLiveData() {
        return erorrLiveData;
    }

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        recipesLiveData = new MutableLiveData<>();
        erorrLiveData = new MutableLiveData<>();
        detailsRecipeLiveData = new MutableLiveData<>();
        currentRecipeDetails = new MutableLiveData<>();
    }


    public void autoSearch(String searchText) {
        ApiManager.getAPIs().autoCompleteRecipies(searchText)
                .enqueue(new Callback<List<RecipesAutoResponse>>() {
                    @Override
                    public void onResponse(Call<List<RecipesAutoResponse>> call, Response<List<RecipesAutoResponse>> response) {
                        if (response.isSuccessful()) {
                            recipesLiveData.postValue(response.body());
                        } else recipesLiveData.postValue(null);
                    }

                    @Override
                    public void onFailure(Call<List<RecipesAutoResponse>> call, Throwable t) {

                        erorrLiveData.postValue(t.getLocalizedMessage());

                    }
                });


    }


    public void search(RecipesAutoResponse recipesAutoResponse) {

        ApiManager.getAPIs().searchRecipe(recipesAutoResponse.getTitle()).enqueue(new Callback<RecipeResponse>() {
            @Override
            public void onResponse(Call<RecipeResponse> call, Response<RecipeResponse> response) {
                if (response.isSuccessful()) {
                    detailsRecipeLiveData.postValue(response.body());
                } else detailsRecipeLiveData.postValue(null);

            }

            @Override
            public void onFailure(Call<RecipeResponse> call, Throwable t) {
                erorrLiveData.postValue(t.getLocalizedMessage());

            }
        });


    }


    public void searchItemClicked(ResultsItem recipe) {


        ApiManager.getAPIs().getFullDetails(recipe.getId()).enqueue(new Callback<DetailsResponse>() {
            @Override
            public void onResponse(Call<DetailsResponse> call, Response<DetailsResponse> response) {


                if (response.isSuccessful()) {
                    currentRecipeDetails.postValue(response.body());
                } else {
                    try {
                        erorrLiveData.postValue(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


            @Override
            public void onFailure(Call<DetailsResponse> call, Throwable t) {
                erorrLiveData.postValue(t.getLocalizedMessage());

            }
        });


    }


}
