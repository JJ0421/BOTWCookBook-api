package com.BOTW.CookBook.Recipes;

import java.util.*;

public class Recipe {
	private int id;
	private String name;
	private List<String> ingredients;
	private String effect;
	
	public Recipe() {
	}
	
	public Recipe(int id, String name, List<String> ingredients, String effect) {
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.effect = effect;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	
	
	
}
