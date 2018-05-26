package com.BOTW.CookBook.Recipes;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Recipe {
	@Id
	private int id;
	private String name;
	private String ingredients;
	private String effect;
	private String notes;
	private String hearts;
	@Lob
	private byte[] image;
	
	public Recipe() {}
	
	public Recipe(int id, String name, String ingredients, String effect, String notes, String hearts, byte[] image) {
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.effect = effect;
		this.notes = notes;
		this.hearts = hearts;
		this.image = image;
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
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getHearts() {
		return hearts;
	}
	public void setHearts(String hearts) {
		this.hearts = hearts;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
