package br.com.jamesson.behavioral_patterns.strategy.worker.jobs;

import br.com.jamesson.behavioral_patterns.strategy.person.strategies.work.DeveloperStrategy;
import br.com.jamesson.behavioral_patterns.strategy.worker.strategies.eat.VeggieFoodStrategy;
import br.com.jamesson.behavioral_patterns.strategy.worker.strategies.transportation.BikeStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
