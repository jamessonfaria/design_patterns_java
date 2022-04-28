package br.com.jamesson.creational_patterns.abstract_factory.apple.factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.CountryRulesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone11;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules){
		super(rules);
	}

	@Override
	protected IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
