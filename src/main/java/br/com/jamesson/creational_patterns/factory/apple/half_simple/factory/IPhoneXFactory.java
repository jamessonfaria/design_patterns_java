package br.com.jamesson.creational_patterns.factory.apple.half_simple.factory;

import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhoneX;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else
            return null;
    }

}
