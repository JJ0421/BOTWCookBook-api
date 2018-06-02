package com.BOTW.CookBook.Recipes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	// /GET   ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//Gets all recipes
	@RequestMapping("/api/recipes")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}
	
	//Gets all recipes by name
	@RequestMapping("/api/recipes/name/{name}")
	public List<Recipe> getRecipesByName(@PathVariable String name) {
		return recipeService.getRecipesByName(name);
	}
	
	
	//Finds the recipe whose ingredients matches exactly the ingredients being searched
	@RequestMapping("/api/find/recipes/ingredients/{ingred1}")
	public List<Recipe> getRecipesByIngredients(@PathVariable String ingred1){
		return recipeService.getRecipesByIngredients(ingred1);
	}
	
	@RequestMapping("/api/find/recipes/ingredients/{ingred1}/{ingred2}")
	public List<Recipe> getRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2){
		return recipeService.getRecipesByIngredients(ingred1, ingred2);
	}
	
	@RequestMapping("/api/find/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}")
	public List<Recipe> getRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3){
		return recipeService.getRecipesByIngredients(ingred1, ingred2, ingred3);
	}
		
	@RequestMapping("/api/find/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}/{ingred4}")
	public List<Recipe> getRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3, @PathVariable String ingred4){
		return recipeService.getRecipesByIngredients(ingred1, ingred2, ingred3, ingred4);
	}
	
	@RequestMapping("/api/find/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}/{ingred4}/{ingred5}")
	public List<Recipe> getRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3, @PathVariable String ingred4, @PathVariable String ingred5){
		return recipeService.getRecipesByIngredients(ingred1, ingred2, ingred3, ingred4, ingred5);
	}
	
	
	//Does a search on recipes that contain at least the ingredients being searched
	@RequestMapping("/api/search/recipes/ingredients/{ingred1}")
	public List<Recipe> searchRecipesByIngredients(@PathVariable String ingred1){
		return recipeService.searchRecipesByIngredients(ingred1);
	}
	
	@RequestMapping("/api/search/recipes/ingredients/{ingred1}/{ingred2}")
	public List<Recipe> searchRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2){
		return recipeService.searchRecipesByIngredients(ingred1, ingred2);
	}
	
	@RequestMapping("/api/search/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}")
	public List<Recipe> searchRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3){
		return recipeService.searchRecipesByIngredients(ingred1, ingred2, ingred3);
	}
		
	@RequestMapping("/api/search/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}/{ingred4}")
	public List<Recipe> searchRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3, @PathVariable String ingred4){
		return recipeService.searchRecipesByIngredients(ingred1, ingred2, ingred3, ingred4);
	}
	
	@RequestMapping("/api/search/recipes/ingredients/{ingred1}/{ingred2}/{ingred3}/{ingred4}/{ingred5}")
	public List<Recipe> searchRecipesByIngredients(@PathVariable String ingred1, @PathVariable String ingred2, @PathVariable String ingred3, @PathVariable String ingred4, @PathVariable String ingred5){
		return recipeService.getRecipesByIngredients(ingred1, ingred2, ingred3, ingred4, ingred5);
	}
	
	
	// /POST  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(method=RequestMethod.POST, value="/api/add/recipe")
	public boolean addRecipe(@RequestBody Recipe recipe) {
		return recipeService.addRecipe(recipe);
	}
	
}
