package com.BOTW.CookBook.Ingredients;

import java.util.List;

public interface IngredientServiceInterface{

	List<Ingredient> getIngredients();
	
	Ingredient getIngredientByName(String name);
	
	List<Ingredient> getIngredientsByEffect(String effect);
	
}
