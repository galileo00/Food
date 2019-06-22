package com.example.food.Models.RecipesAuto;

import com.google.gson.annotations.SerializedName;

public class RecipesAutoResponse{

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"RecipesAutoResponse{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}