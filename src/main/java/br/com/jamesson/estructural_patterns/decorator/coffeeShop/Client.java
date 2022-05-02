package br.com.jamesson.estructural_patterns.decorator.coffeeShop;

import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.Drink;
import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.Expresso;
import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.Tea;
import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.jamesson.estructural_patterns.decorator.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
	}
}
