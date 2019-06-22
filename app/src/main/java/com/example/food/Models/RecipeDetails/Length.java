package com.example.food.Models.RecipeDetails;

import com.google.gson.annotations.SerializedName;

public class Length{

	@SerializedName("number")
	private int number;

	@SerializedName("unit")
	private String unit;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	@Override
 	public String toString(){
		return 
			"Length{" + 
			"number = '" + number + '\'' + 
			",unit = '" + unit + '\'' + 
			"}";
		}
}