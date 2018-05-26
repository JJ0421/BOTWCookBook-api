package com.BOTW.CookBook.Ingredients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {

	
	@Autowired
	private IngredientService ingredientService;
	
	@RequestMapping("/ingredients")
	public List<Ingredient> getIngredients() {
		return ingredientService.getIngredients();
	}
	
	@RequestMapping("/ingredients/getByName/{name}")
	public Ingredient getIngredientByName(@PathVariable String name) {
		return ingredientService.getIngredientByName(name);
	}
	
	@RequestMapping("/ingredients/getByEffect/{effect}")
	public List<Ingredient> getIngredientByEffect(@PathVariable String effect) {
		return ingredientService.getIngredientsByEffect(effect);
	}
	
	
}
