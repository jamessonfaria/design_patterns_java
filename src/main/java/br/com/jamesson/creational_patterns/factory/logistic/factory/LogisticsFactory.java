package br.com.jamesson.creational_patterns.factory.logistic.factory;

import br.com.jamesson.creational_patterns.factory.logistic.model.Transport;

public abstract class LogisticsFactory {
    public void planDelivery(){
        Transport transp = createTransport();
        transp.deliver();
    };

    protected abstract Transport createTransport();
}
