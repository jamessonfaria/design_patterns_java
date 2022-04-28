package br.com.jamesson.creational_patterns.factory.apple.half_simple.factory;

import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone11;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
