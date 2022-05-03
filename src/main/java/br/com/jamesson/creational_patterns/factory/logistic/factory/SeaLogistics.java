package br.com.jamesson.creational_patterns.factory.logistic.factory;

import br.com.jamesson.creational_patterns.factory.logistic.model.Ship;
import br.com.jamesson.creational_patterns.factory.logistic.model.Transport;

public class SeaLogistics extends LogisticsFactory {

    @Override
    protected Transport createTransport() {
        return new Ship();
    }
    
}
