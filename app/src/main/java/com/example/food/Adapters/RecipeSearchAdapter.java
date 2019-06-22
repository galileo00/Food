package com.example.food.Adapters;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.food.Models.Recipes.ResultsItem;
import com.example.food.Models.RecipesAuto.RecipesAutoResponse;
import com.example.food.R;

import java.util.List;

public class RecipeSearchAdapter extends RecyclerView.Adapter<RecipeSearchAdapter.ViewHolder> {


    private OnItemClickListener onItemViewClickListener;

    public void setOnItemViewClickListener(OnItemClickListener onItemViewClickListener) {
        this.onItemViewClickListener = onItemViewClickListener;
    }

    private List<ResultsItem> list;

    public RecipeSearchAdapter(List<ResultsItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item_search, viewGroup, false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, @SuppressLint("RecyclerView") final int position) {


        final ResultsItem resultsItem = list.get(position);
        viewHolder.recipeDeatailedName.setText(resultsItem.getTitle());
        viewHolder.minToReady.setText(resultsItem.getReadyInMinutes()+"min");
        Glide.with(viewHolder.itemView)
                .load("https://spoonacular.com/recipeImages/"+resultsItem.getId()+"-"+"556x370.jpg")
                .into(viewHolder.imageView);





        if (onItemViewClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemViewClickListener.onItemClicked(resultsItem, position);
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
        TextView recipeDeatailedName;
        TextView minToReady;
        ImageView imageView;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeDeatailedName = itemView.findViewById(R.id.recipeDetaildName);
            minToReady = itemView.findViewById(R.id.minutesToReady);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


    public interface OnItemClickListener {


        void onItemClicked(ResultsItem resultsItem, int position);


    }




    public void changeData (List<ResultsItem> list ){
        this.list =list;
        notifyDataSetChanged();


    }

}

