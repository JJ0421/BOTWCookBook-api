package com.BOTW.CookBook.Recipes;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Integer>{
	
	public List<Recipe> findByName(String name);
	
	public List<Recipe> findByIngredients(String ingredients);
	
	@Query(value = "SELECT * FROM recipe WHERE ingredients LIKE CONCAT('%', :ingred, '%')", nativeQuery = true)
	public List<Recipe> searchByIngredients(String ingred);

}
