package br.com.jamesson.creational_patterns.builder.spolleto.after.model.builder;

import br.com.jamesson.creational_patterns.builder.spolleto.after.model.Salad;

public class SaladBuilder extends DefaultMealBuilder<Salad> {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
