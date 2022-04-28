package br.com.jamesson.creational_patterns.factory.apple.half_simple.factory;

import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone;

public abstract class IPhoneFactory {
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
