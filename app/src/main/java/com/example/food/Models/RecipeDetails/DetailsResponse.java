package com.example.food.Models.RecipeDetails;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DetailsResponse{

	@SerializedName("instructions")
	private String instructions;

	@SerializedName("sustainable")
	private boolean sustainable;

	@SerializedName("analyzedInstructions")
	private List<AnalyzedInstructionsItem> analyzedInstructions;

	@SerializedName("glutenFree")
	private boolean glutenFree;

	@SerializedName("veryPopular")
	private boolean veryPopular;

	@SerializedName("healthScore")
	private int healthScore;

	@SerializedName("title")
	private String title;

	@SerializedName("diets")
	private List<String> diets;

	@SerializedName("aggregateLikes")
	private int aggregateLikes;

	@SerializedName("sourceUrl")
	private String sourceUrl;

	@SerializedName("readyInMinutes")
	private int readyInMinutes;

	@SerializedName("creditsText")
	private String creditsText;

	@SerializedName("dairyFree")
	private boolean dairyFree;

	@SerializedName("servings")
	private int servings;

	@SerializedName("vegetarian")
	private boolean vegetarian;

	@SerializedName("whole30")
	private boolean whole30;

	@SerializedName("creditText")
	private String creditText;

	@SerializedName("id")
	private int id;

	@SerializedName("preparationMinutes")
	private int preparationMinutes;

	@SerializedName("imageType")
	private String imageType;

	@SerializedName("winePairing")
	private WinePairing winePairing;

	@SerializedName("cookingMinutes")
	private int cookingMinutes;

	@SerializedName("image")
	private String image;

	@SerializedName("veryHealthy")
	private boolean veryHealthy;

	@SerializedName("vegan")
	private boolean vegan;

	@SerializedName("cheap")
	private boolean cheap;

	@SerializedName("extendedIngredients")
	private List<ExtendedIngredientsItem> extendedIngredients;

	@SerializedName("dishTypes")
	private List<String> dishTypes;

	@SerializedName("gaps")
	private String gaps;

	@SerializedName("cuisines")
	private List<Object> cuisines;

	@SerializedName("lowFodmap")
	private boolean lowFodmap;

	@SerializedName("weightWatcherSmartPoints")
	private int weightWatcherSmartPoints;

	@SerializedName("occasions")
	private List<Object> occasions;

	@SerializedName("spoonacularScore")
	private int spoonacularScore;

	@SerializedName("pricePerServing")
	private double pricePerServing;

	@SerializedName("spoonacularSourceUrl")
	private String spoonacularSourceUrl;

	@SerializedName("sourceName")
	private String sourceName;

	@SerializedName("ketogenic")
	private boolean ketogenic;

	public void setInstructions(String instructions){
		this.instructions = instructions;
	}

	public String getInstructions(){
		return instructions;
	}

	public void setSustainable(boolean sustainable){
		this.sustainable = sustainable;
	}

	public boolean isSustainable(){
		return sustainable;
	}

	public void setAnalyzedInstructions(List<AnalyzedInstructionsItem> analyzedInstructions){
		this.analyzedInstructions = analyzedInstructions;
	}

	public List<AnalyzedInstructionsItem> getAnalyzedInstructions(){
		return analyzedInstructions;
	}

	public void setGlutenFree(boolean glutenFree){
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree(){
		return glutenFree;
	}

	public void setVeryPopular(boolean veryPopular){
		this.veryPopular = veryPopular;
	}

	public boolean isVeryPopular(){
		return veryPopular;
	}

	public void setHealthScore(int healthScore){
		this.healthScore = healthScore;
	}

	public int getHealthScore(){
		return healthScore;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDiets(List<String> diets){
		this.diets = diets;
	}

	public List<String> getDiets(){
		return diets;
	}

	public void setAggregateLikes(int aggregateLikes){
		this.aggregateLikes = aggregateLikes;
	}

	public int getAggregateLikes(){
		return aggregateLikes;
	}

	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public String getSourceUrl(){
		return sourceUrl;
	}

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setCreditsText(String creditsText){
		this.creditsText = creditsText;
	}

	public String getCreditsText(){
		return creditsText;
	}

	public void setDairyFree(boolean dairyFree){
		this.dairyFree = dairyFree;
	}

	public boolean isDairyFree(){
		return dairyFree;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setVegetarian(boolean vegetarian){
		this.vegetarian = vegetarian;
	}

	public boolean isVegetarian(){
		return vegetarian;
	}

	public void setWhole30(boolean whole30){
		this.whole30 = whole30;
	}

	public boolean isWhole30(){
		return whole30;
	}

	public void setCreditText(String creditText){
		this.creditText = creditText;
	}

	public String getCreditText(){
		return creditText;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPreparationMinutes(int preparationMinutes){
		this.preparationMinutes = preparationMinutes;
	}

	public int getPreparationMinutes(){
		return preparationMinutes;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
	}

	public void setWinePairing(WinePairing winePairing){
		this.winePairing = winePairing;
	}

	public WinePairing getWinePairing(){
		return winePairing;
	}

	public void setCookingMinutes(int cookingMinutes){
		this.cookingMinutes = cookingMinutes;
	}

	public int getCookingMinutes(){
		return cookingMinutes;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setVeryHealthy(boolean veryHealthy){
		this.veryHealthy = veryHealthy;
	}

	public boolean isVeryHealthy(){
		return veryHealthy;
	}

	public void setVegan(boolean vegan){
		this.vegan = vegan;
	}

	public boolean isVegan(){
		return vegan;
	}

	public void setCheap(boolean cheap){
		this.cheap = cheap;
	}

	public boolean isCheap(){
		return cheap;
	}

	public void setExtendedIngredients(List<ExtendedIngredientsItem> extendedIngredients){
		this.extendedIngredients = extendedIngredients;
	}

	public List<ExtendedIngredientsItem> getExtendedIngredients(){
		return extendedIngredients;
	}

	public void setDishTypes(List<String> dishTypes){
		this.dishTypes = dishTypes;
	}

	public List<String> getDishTypes(){
		return dishTypes;
	}

	public void setGaps(String gaps){
		this.gaps = gaps;
	}

	public String getGaps(){
		return gaps;
	}

	public void setCuisines(List<Object> cuisines){
		this.cuisines = cuisines;
	}

	public List<Object> getCuisines(){
		return cuisines;
	}

	public void setLowFodmap(boolean lowFodmap){
		this.lowFodmap = lowFodmap;
	}

	public boolean isLowFodmap(){
		return lowFodmap;
	}

	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints){
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	public int getWeightWatcherSmartPoints(){
		return weightWatcherSmartPoints;
	}

	public void setOccasions(List<Object> occasions){
		this.occasions = occasions;
	}

	public List<Object> getOccasions(){
		return occasions;
	}

	public void setSpoonacularScore(int spoonacularScore){
		this.spoonacularScore = spoonacularScore;
	}

	public int getSpoonacularScore(){
		return spoonacularScore;
	}

	public void setPricePerServing(double pricePerServing){
		this.pricePerServing = pricePerServing;
	}

	public double getPricePerServing(){
		return pricePerServing;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl){
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public String getSpoonacularSourceUrl(){
		return spoonacularSourceUrl;
	}

	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	public String getSourceName(){
		return sourceName;
	}

	public void setKetogenic(boolean ketogenic){
		this.ketogenic = ketogenic;
	}

	public boolean isKetogenic(){
		return ketogenic;
	}

	@Override
 	public String toString(){
		return 
			"DetailsResponse{" + 
			"instructions = '" + instructions + '\'' + 
			",sustainable = '" + sustainable + '\'' + 
			",analyzedInstructions = '" + analyzedInstructions + '\'' + 
			",glutenFree = '" + glutenFree + '\'' + 
			",veryPopular = '" + veryPopular + '\'' + 
			",healthScore = '" + healthScore + '\'' + 
			",title = '" + title + '\'' + 
			",diets = '" + diets + '\'' + 
			",aggregateLikes = '" + aggregateLikes + '\'' + 
			",sourceUrl = '" + sourceUrl + '\'' + 
			",readyInMinutes = '" + readyInMinutes + '\'' + 
			",creditsText = '" + creditsText + '\'' + 
			",dairyFree = '" + dairyFree + '\'' + 
			",servings = '" + servings + '\'' + 
			",vegetarian = '" + vegetarian + '\'' + 
			",whole30 = '" + whole30 + '\'' + 
			",creditText = '" + creditText + '\'' + 
			",id = '" + id + '\'' + 
			",preparationMinutes = '" + preparationMinutes + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",winePairing = '" + winePairing + '\'' + 
			",cookingMinutes = '" + cookingMinutes + '\'' + 
			",image = '" + image + '\'' + 
			",veryHealthy = '" + veryHealthy + '\'' + 
			",vegan = '" + vegan + '\'' + 
			",cheap = '" + cheap + '\'' + 
			",extendedIngredients = '" + extendedIngredients + '\'' + 
			",dishTypes = '" + dishTypes + '\'' + 
			",gaps = '" + gaps + '\'' + 
			",cuisines = '" + cuisines + '\'' + 
			",lowFodmap = '" + lowFodmap + '\'' + 
			",weightWatcherSmartPoints = '" + weightWatcherSmartPoints + '\'' + 
			",occasions = '" + occasions + '\'' + 
			",spoonacularScore = '" + spoonacularScore + '\'' + 
			",pricePerServing = '" + pricePerServing + '\'' + 
			",spoonacularSourceUrl = '" + spoonacularSourceUrl + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			",ketogenic = '" + ketogenic + '\'' + 
			"}";
		}
}