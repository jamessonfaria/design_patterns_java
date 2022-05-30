package br.com.jamesson.behavioral_patterns.strategy.worker.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I ride a bike to go anywhere");
	}

}
