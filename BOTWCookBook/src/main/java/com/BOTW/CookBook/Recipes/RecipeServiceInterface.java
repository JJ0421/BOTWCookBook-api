package com.BOTW.CookBook.Recipes;

import java.util.List;

public interface RecipeServiceInterface {
	
	List<Recipe> getRecipes();
	
	public List<Recipe> getRecipesByName(String name);
	
	public List<Recipe> getRecipesByIngredients(String ingred1);
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2);
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3);
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4);
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4, String ingred5);
	
	public List<Recipe> searchRecipesByIngredients(String ingred1);
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2);
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2, String ingred3);
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4);
}
