package br.com.jamesson.behavioral_patterns.mediator.translate.model;

import br.com.jamesson.behavioral_patterns.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
