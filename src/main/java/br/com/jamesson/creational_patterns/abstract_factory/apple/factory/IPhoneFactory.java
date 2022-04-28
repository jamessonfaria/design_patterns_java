package br.com.jamesson.creational_patterns.abstract_factory.apple.factory;

import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.CountryRulesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone;

public abstract class IPhoneFactory {
    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIPhone(level);
        
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
