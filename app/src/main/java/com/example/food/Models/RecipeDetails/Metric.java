package com.example.food.Models.RecipeDetails;

import com.google.gson.annotations.SerializedName;

public class Metric{

	@SerializedName("amount")
	private double amount;

	@SerializedName("unitShort")
	private String unitShort;

	@SerializedName("unitLong")
	private String unitLong;

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getAmount(){
		return amount;
	}

	public void setUnitShort(String unitShort){
		this.unitShort = unitShort;
	}

	public String getUnitShort(){
		return unitShort;
	}

	public void setUnitLong(String unitLong){
		this.unitLong = unitLong;
	}

	public String getUnitLong(){
		return unitLong;
	}

	@Override
 	public String toString(){
		return 
			"Metric{" + 
			"amount = '" + amount + '\'' + 
			",unitShort = '" + unitShort + '\'' + 
			",unitLong = '" + unitLong + '\'' + 
			"}";
		}
}