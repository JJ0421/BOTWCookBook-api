package com.BOTW.CookBook.Recipes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {
	
	public List<Recipe> getRecipes(){
		Recipe steak = new Recipe();
		steak.setEffect("Heals 5");
		steak.setId(1);
		steak.setName("Cooked Steak");
		List<String> ingredients = new ArrayList<String>();
		ingredients.add("Raw Steak");
		steak.setIngredients(ingredients);
		
		List<Recipe> recipes = new ArrayList<Recipe>();
		recipes.add(steak);
		return recipes;
	}
	
	
}
