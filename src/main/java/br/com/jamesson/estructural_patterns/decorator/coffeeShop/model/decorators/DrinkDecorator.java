package br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.decorators;

import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}