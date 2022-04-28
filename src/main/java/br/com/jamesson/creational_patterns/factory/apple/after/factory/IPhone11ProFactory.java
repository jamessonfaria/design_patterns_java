package br.com.jamesson.creational_patterns.factory.apple.after.factory;

import br.com.jamesson.creational_patterns.factory.apple.after.model.IPhone;
import br.com.jamesson.creational_patterns.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
