package com.example.food.Adapters;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.food.Models.RecipesAuto.RecipesAutoResponse;
import com.example.food.R;

import java.util.List;

public class RecipeAutoSearchAdapter extends RecyclerView.Adapter<RecipeAutoSearchAdapter.ViewHolder> {


    private OnItemClickListener onItemViewClickListener;

    public void setOnItemViewClickListener(OnItemClickListener onItemViewClickListener) {
        this.onItemViewClickListener = onItemViewClickListener;
    }

    private List<RecipesAutoResponse> list;

    public RecipeAutoSearchAdapter(List<RecipesAutoResponse> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item_recipe_auto_search, viewGroup, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, @SuppressLint("RecyclerView") final int position) {


        final RecipesAutoResponse recipesAutoResponse = list.get(position);
        viewHolder.recipeName.setText(recipesAutoResponse.getTitle());
        if (onItemViewClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemViewClickListener.onItemClicked(recipesAutoResponse, position);
                }
            });

        }

    }


    @Override
    public int getItemCount() {
        if (list == null) return 0;
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView recipeName;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeName = itemView.findViewById(R.id.recipeName);
        }
    }


    public interface OnItemClickListener {


        void onItemClicked(RecipesAutoResponse recipeSearchItem, int position);


    }




    public void changeData (List<RecipesAutoResponse> list ){
        this.list =list;
        notifyDataSetChanged();


    }

}

