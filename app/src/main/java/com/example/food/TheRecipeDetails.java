package com.example.food;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.food.Base.BaseActivity;
import com.example.food.Models.RecipeDetails.DetailsResponse;
import com.example.food.Models.Recipes.ResultsItem;
import com.example.food.ViewModels.RecipeViewModel;

public class TheRecipeDetails extends BaseActivity {

    public static ResultsItem resultsItem;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private ImageView imageView;
    private TextView textView;
    RecipeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_recipe_details);


        viewModel = ViewModelProviders.of(this).get(RecipeViewModel.class);
        viewModel.searchItemClicked(resultsItem);


        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        viewModel.getErorrLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.e("the eroor ", s);
            }
        });


        viewModel.getCurrentRecipeDetails().observe(this, new Observer<DetailsResponse>() {
            @Override
            public void onChanged(@Nullable DetailsResponse detailsResponse) {
                Glide.with(activity)
                        .load(detailsResponse.getImage())
                        .into(imageView);

                textView3.setText(detailsResponse.getInstructions());
                textView.setText(detailsResponse.getTitle());
                textView2.setText(String.format("sorces : %s", detailsResponse.getSourceUrl()));
                textView4.setText(String.format("source : %s", detailsResponse.getCreditsText()));


            }
        });
    }
}
