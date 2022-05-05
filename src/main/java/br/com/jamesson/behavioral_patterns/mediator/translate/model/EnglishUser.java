package br.com.jamesson.behavioral_patterns.mediator.translate.model;

import br.com.jamesson.behavioral_patterns.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
