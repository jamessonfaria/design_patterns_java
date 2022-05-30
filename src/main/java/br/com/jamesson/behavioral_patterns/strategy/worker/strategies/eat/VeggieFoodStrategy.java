package br.com.jamesson.behavioral_patterns.strategy.worker.strategies.eat;

public class VeggieFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("I eat veggie food!");
	}

}
