package br.com.jamesson.behavioral_patterns.strategy.calc.after.strategies;

public class MultiplicationOperation implements OperationStrategy {

	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}

}
