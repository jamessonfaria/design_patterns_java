package br.com.jamesson.creational_patterns.abstract_factory.apple.factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.CountryRulesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhoneX;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(rules);
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else
            return null;
    }

}
