package com.BOTW.CookBook.Ingredients;

import java.util.List;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService implements IngredientServiceInterface{

	@Autowired
	private IngredientRepository ingredientRepository;
	
	public List<Ingredient> getIngredients() {
		List<Ingredient> ingredients = new ArrayList<>();
		ingredientRepository.findAll().forEach(ingredients::add);
		return ingredients;
	}
		
	public Ingredient getIngredientByName(String name) {
		return ingredientRepository.findByName(name);
	}
	
	public List<Ingredient> getIngredientsByEffect(String effect) {
		return ingredientRepository.findByEffect(effect);
	}
	
	
	
}
