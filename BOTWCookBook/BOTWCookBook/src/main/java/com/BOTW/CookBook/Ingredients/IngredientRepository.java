package com.BOTW.CookBook.Ingredients;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
	public Ingredient findByName(String name);	
	public List<Ingredient> findByEffect(String effect);
}
