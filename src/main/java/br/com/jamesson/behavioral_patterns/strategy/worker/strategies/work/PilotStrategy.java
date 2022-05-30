package br.com.jamesson.behavioral_patterns.strategy.worker.strategies.work;

public class PilotStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I pilot airplanes to earn a lot of money");
	}

}
