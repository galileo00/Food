package com.example.food.Models.Recipes;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("readyInMinutes")
	private int readyInMinutes;

	@SerializedName("image")
	private String image;

	@SerializedName("servings")
	private int servings;

	@SerializedName("imageUrls")
	private List<String> imageUrls;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setImageUrls(List<String> imageUrls){
		this.imageUrls = imageUrls;
	}

	public List<String> getImageUrls(){
		return imageUrls;
	}

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
			"ResultsItem{" + 
			"readyInMinutes = '" + readyInMinutes + '\'' + 
			",image = '" + image + '\'' + 
			",servings = '" + servings + '\'' + 
			",imageUrls = '" + imageUrls + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}