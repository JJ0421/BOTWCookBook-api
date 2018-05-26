package com.BOTW.CookBook.Recipes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService implements RecipeServiceInterface{
	
	@Autowired
	private RecipeRepository recipeRepo;
	
	
	// /GET  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//Gets all recipes
	public List<Recipe> getRecipes(){
		List<Recipe> recipes = new ArrayList<>();
		recipeRepo.findAll().forEach(recipes::add);;
		return recipes;
	}
	
	//Gets all recipes that match the name being searched
	public List<Recipe> getRecipesByName(String name) {
		return recipeRepo.findByName(name);
	}
	
	//Sorts the searched ingredients in alphabetical order to match
	//the pattern of corresponding ingredients in the database. Finds
	//recipes who have exactly the same ingredients being searched.
	public List<Recipe> getRecipesByIngredients(String ingred1){
		ingred1 = ingred1.toLowerCase()+";";
		return recipeRepo.findByIngredients(ingred1);
	}
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2){
		List<String> ingredientsList = new ArrayList<>();
		ingredientsList.add(ingred1.toLowerCase()+";");
		ingredientsList.add(ingred2.toLowerCase()+";");
		Collections.sort(ingredientsList);
		String ingredients = "";
		for(int i = 0; i < ingredientsList.size(); i++) {
			ingredients += ingredientsList.get(i);
		}
		
		return recipeRepo.findByIngredients(ingredients);
	}
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3){
		List<String> ingredientsList = new ArrayList<>();
		ingredientsList.add(ingred1.toLowerCase()+";");
		ingredientsList.add(ingred2.toLowerCase()+";");
		ingredientsList.add(ingred3.toLowerCase()+";");
		Collections.sort(ingredientsList);
		String ingredients = "";
		for(int i = 0; i < ingredientsList.size(); i++) {
			ingredients += ingredientsList.get(i);
		}
		
		return recipeRepo.findByIngredients(ingredients);
	}
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4){
		List<String> ingredientsList = new ArrayList<>();
		ingredientsList.add(ingred1.toLowerCase()+";");
		ingredientsList.add(ingred2.toLowerCase()+";");
		ingredientsList.add(ingred3.toLowerCase()+";");
		ingredientsList.add(ingred4.toLowerCase()+";");
		Collections.sort(ingredientsList);
		String ingredients = "";
		for(int i = 0; i < ingredientsList.size(); i++) {
			ingredients += ingredientsList.get(i);
		}
		
		return recipeRepo.findByIngredients(ingredients);
	}
	
	public List<Recipe> getRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4, String ingred5){
		List<String> ingredientsList = new ArrayList<>();
		ingredientsList.add(ingred1.toLowerCase()+";");
		ingredientsList.add(ingred2.toLowerCase()+";");
		ingredientsList.add(ingred3.toLowerCase()+";");
		ingredientsList.add(ingred4.toLowerCase()+";");
		ingredientsList.add(ingred5.toLowerCase()+";");
		Collections.sort(ingredientsList);
		String ingredients = "";
		for(int i = 0; i < ingredientsList.size(); i++) {
			ingredients += ingredientsList.get(i);
		}
		
		return recipeRepo.findByIngredients(ingredients);
	}
	
	
    //Gets the recipes who contain at least the ingredients being searched.
	//Compares the ingredients being searched by the ingredients of corresponding
	//records to look for a match.
	public List<Recipe> searchRecipesByIngredients(String ingred1){
		return recipeRepo.searchByIngredients(ingred1);
	}
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2){
		List<Recipe> queried = recipeRepo.searchByIngredients(ingred1);
		List<Recipe> recipes = new ArrayList<>();
		String [] ingredientsArr;
		int count = 0;
		String i1;
		String i2;
		for(int i = 0; i < queried.size(); i++) {
			count = 0;
			i1 = ingred1;
			i2 = ingred2;
			ingredientsArr = queried.get(i).getIngredients().split(";");
			for(int j = 0; j < ingredientsArr.length; j++) {
				if(ingredientsArr[j].toLowerCase().equals(i1.toLowerCase())) {
					i1 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i2.toLowerCase())) {
					i2 = "";
					count++;
				}

			}
			if(count == 2) {
				recipes.add(queried.get(i));
			}
		}
		return recipes;
	}
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2, String ingred3){
		List<Recipe> queried = recipeRepo.searchByIngredients(ingred1);
		List<Recipe> recipes = new ArrayList<>();
		String [] ingredientsArr;
		int count = 0;
		String i1;
		String i2;
		String i3;
		for(int i = 0; i < queried.size(); i++) {
			count = 0;
			i1 = ingred1;
			i2 = ingred2;
			i3 = ingred3;
			ingredientsArr = queried.get(i).getIngredients().split(";");
			for(int j = 0; j < ingredientsArr.length; j++) {
				if(ingredientsArr[j].toLowerCase().equals(i1.toLowerCase())) {
					i1 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i2.toLowerCase())) {
					i2 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i3.toLowerCase())) {
					i3 = "";
					count++;
				}
			}
			if(count == 3) {
				recipes.add(queried.get(i));
			}
		}
		return recipes;
	}
	
	public List<Recipe> searchRecipesByIngredients(String ingred1, String ingred2, String ingred3, String ingred4){
		List<Recipe> queried = recipeRepo.searchByIngredients(ingred1);
		List<Recipe> recipes = new ArrayList<>();
		String [] ingredientsArr;
		int count = 0;
		String i1;
		String i2;
		String i3;
		String i4;
		for(int i = 0; i < queried.size(); i++) {
			count = 0;
			i1 = ingred1;
			i2 = ingred2;
			i3 = ingred3;
			i4 = ingred4;
			ingredientsArr = queried.get(i).getIngredients().split(";");
			for(int j = 0; j < ingredientsArr.length; j++) {
				if(ingredientsArr[j].toLowerCase().equals(i1.toLowerCase())) {
					i1 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i2.toLowerCase())) {
					i2 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i3.toLowerCase())) {
					i3 = "";
					count++;
				}
				else if(ingredientsArr[j].toLowerCase().equals(i4.toLowerCase())) {
					i4 = "";
					count++;
				}
			}
			if(count == 4) {
				recipes.add(queried.get(i));
			}
		}
		return recipes;
	}
	
	
	// /POST  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
}
