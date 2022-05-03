package br.com.jamesson.creational_patterns.factory.logistic.factory;

import br.com.jamesson.creational_patterns.factory.logistic.model.Transport;
import br.com.jamesson.creational_patterns.factory.logistic.model.Truck;

public class RoadLogistics extends LogisticsFactory {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
    
}
