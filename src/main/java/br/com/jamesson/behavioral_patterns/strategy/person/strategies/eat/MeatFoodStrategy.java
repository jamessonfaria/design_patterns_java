package br.com.jamesson.behavioral_patterns.strategy.person.strategies.eat;

public class MeatFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("I eat meat!");
	}

}
