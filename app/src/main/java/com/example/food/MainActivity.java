package com.example.food;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.example.food.Adapters.RecipeAutoSearchAdapter;
import com.example.food.Adapters.RecipeSearchAdapter;
import com.example.food.Base.BaseActivity;
import com.example.food.Models.RecipeDetails.DetailsResponse;
import com.example.food.Models.Recipes.RecipeResponse;
import com.example.food.Models.Recipes.ResultsItem;
import com.example.food.Models.RecipesAuto.RecipesAutoResponse;
import com.example.food.ViewModels.RecipeViewModel;

import java.util.List;

public class MainActivity extends BaseActivity {

    private RecyclerView autoSearchReccyclerView;
    private TextInputEditText searchEditText;
    RecipeViewModel viewModel;
    RecipeAutoSearchAdapter autoSearchAdapter;
    RecyclerView.LayoutManager layoutManager;
    RecipeSearchAdapter recipeSearchAdapter;
    RecyclerView.LayoutManager searchlayoutManager;
    RecyclerView searchRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(RecipeViewModel.class);
        recipeSearchAdapter = new RecipeSearchAdapter(null);
        searchlayoutManager = new LinearLayoutManager(activity);
        searchRecyclerView = findViewById(R.id.SearchReccyclerView);
        searchRecyclerView.setLayoutManager(searchlayoutManager);
        searchRecyclerView.setAdapter(recipeSearchAdapter);
        recipeSearchAdapter.setOnItemViewClickListener(new RecipeSearchAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(ResultsItem resultsItem, int position) {
                TheRecipeDetails.resultsItem = resultsItem ;




                startActivity(new Intent(activity,TheRecipeDetails.class));

            }
        });









        autoSearchReccyclerView = findViewById(R.id.autoSearchReccyclerView);
        searchEditText = findViewById(R.id.searchEditText);
        autoSearchAdapter = new RecipeAutoSearchAdapter(null);
        layoutManager = new LinearLayoutManager(activity);
        autoSearchReccyclerView.setAdapter(autoSearchAdapter);
        autoSearchReccyclerView.setLayoutManager(layoutManager);
        autoSearchAdapter.setOnItemViewClickListener(new RecipeAutoSearchAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(RecipesAutoResponse recipeSearchItem, int position) {
                searchEditText.setText(recipeSearchItem.getTitle());

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        autoSearchReccyclerView.setVisibility(View.GONE);
                        hideSoftKeyboard(activity);


                    }
                }, 200);
                viewModel.search(recipeSearchItem);
                viewModel.getDetailsRecipeLiveData().observe(MainActivity.this, new Observer<RecipeResponse>() {
                    @Override
                    public void onChanged(@Nullable RecipeResponse recipeResponse) {

                        recipeSearchAdapter.changeData(recipeResponse.getResults());

                    }
                });


            }
        });


        viewModel.getRecipesLiveData().observe(this, new Observer<List<RecipesAutoResponse>>() {
            @Override
            public void onChanged(@Nullable List<RecipesAutoResponse> recipesAutoResponses) {
                autoSearchAdapter.changeData(recipesAutoResponses);

            }
        });


        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(final CharSequence s, int start, int before, int count) {
                autoSearchReccyclerView.setVisibility(View.VISIBLE);


                viewModel.autoSearch(s.toString());


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }


    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(
                activity.getCurrentFocus().getWindowToken(), 0);
    }




}
