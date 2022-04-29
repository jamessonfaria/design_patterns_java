package br.com.jamesson.creational_patterns.builder.spolleto.after.model.builder;

import br.com.jamesson.creational_patterns.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends DefaultMealBuilder<Pasta> {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
