package com.BOTW.CookBook.Recipes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	
	@RequestMapping("/recipes")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}
	
	
}
