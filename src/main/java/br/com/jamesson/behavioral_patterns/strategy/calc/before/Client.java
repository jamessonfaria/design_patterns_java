package br.com.jamesson.behavioral_patterns.strategy.calc.before;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult("+"));
		System.out.println(calc.getResult("-"));
		System.out.println(calc.getResult("*"));
		System.out.println(calc.getResult("/"));
	}
}
