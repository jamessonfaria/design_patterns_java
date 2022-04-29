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
	
	public void buildDrink() {};
	public void buildMain() {};
	public void buildSide() {};
	public void buildDessert() {};
	public void buildGift() {};
}
