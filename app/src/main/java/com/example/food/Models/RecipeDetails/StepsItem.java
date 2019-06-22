package com.example.food.Models.RecipeDetails;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StepsItem{

	@SerializedName("number")
	private int number;

	@SerializedName("ingredients")
	private List<IngredientsItem> ingredients;

	@SerializedName("equipment")
	private List<EquipmentItem> equipment;

	@SerializedName("step")
	private String step;

	@SerializedName("length")
	private Length length;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setIngredients(List<IngredientsItem> ingredients){
		this.ingredients = ingredients;
	}

	public List<IngredientsItem> getIngredients(){
		return ingredients;
	}

	public void setEquipment(List<EquipmentItem> equipment){
		this.equipment = equipment;
	}

	public List<EquipmentItem> getEquipment(){
		return equipment;
	}

	public void setStep(String step){
		this.step = step;
	}

	public String getStep(){
		return step;
	}

	public void setLength(Length length){
		this.length = length;
	}

	public Length getLength(){
		return length;
	}

	@Override
 	public String toString(){
		return 
			"StepsItem{" + 
			"number = '" + number + '\'' + 
			",ingredients = '" + ingredients + '\'' + 
			",equipment = '" + equipment + '\'' + 
			",step = '" + step + '\'' + 
			",length = '" + length + '\'' + 
			"}";
		}
}