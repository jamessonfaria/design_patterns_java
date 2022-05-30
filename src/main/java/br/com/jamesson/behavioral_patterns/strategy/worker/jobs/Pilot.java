package br.com.jamesson.behavioral_patterns.strategy.worker.jobs;

import br.com.jamesson.behavioral_patterns.strategy.worker.strategies.eat.MeatFoodStrategy;
import br.com.jamesson.behavioral_patterns.strategy.worker.strategies.transportation.AirplaneStrategy;
import br.com.jamesson.behavioral_patterns.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}
