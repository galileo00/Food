package com.example.food.Models.RecipeDetails;

import com.google.gson.annotations.SerializedName;

public class Measures{

	@SerializedName("metric")
	private Metric metric;

	@SerializedName("us")
	private Us us;

	public void setMetric(Metric metric){
		this.metric = metric;
	}

	public Metric getMetric(){
		return metric;
	}

	public void setUs(Us us){
		this.us = us;
	}

	public Us getUs(){
		return us;
	}

	@Override
 	public String toString(){
		return 
			"Measures{" + 
			"metric = '" + metric + '\'' + 
			",us = '" + us + '\'' + 
			"}";
		}
}