package br.com.jamesson.creational_patterns.factory.apple.after.factory;

import br.com.jamesson.creational_patterns.factory.apple.after.model.IPhone;
import br.com.jamesson.creational_patterns.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
    
}
