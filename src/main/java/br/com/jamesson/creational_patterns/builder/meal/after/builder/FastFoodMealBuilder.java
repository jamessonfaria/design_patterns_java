package br.com.jamesson.creational_patterns.builder.meal.after.builder;

import br.com.jamesson.creational_patterns.builder.meal.after.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
	protected FastFoodMeal meal;
	
	public FastFoodMealBuilder() {
		meal = new FastFoodMeal();
	}
	
	public FastFoodMeal getMeal() {
		return meal;
	}
	
	public abstract void buildDrink();
	public abstract void buildMain();
	public abstract void buildSide();
	public abstract void buildDessert();
	public abstract void buildGift();
}
