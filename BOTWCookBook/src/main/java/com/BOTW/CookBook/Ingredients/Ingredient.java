package com.BOTW.CookBook.Ingredients;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Ingredient {
	
	@Id
	private int id;
	private String name;
	private String type;
	private String hearts;
	private String effect;
	private String potency;
	private String duration;
	
	public Ingredient() {}
	
	public Ingredient(String name, String type, String hearts, String effect, String potency, String duration) {
		this.name = name;
		this.type = type;
		this.hearts = hearts;
		this.effect = effect;
		this.potency = potency;
		this.duration = duration;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHearts() {
		return hearts;
	}
	public void setHearts(String hearts) {
		this.hearts = hearts;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getPotency() {
		return potency;
	}
	public void setPotency(String potency) {
		this.potency = potency;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	
}
