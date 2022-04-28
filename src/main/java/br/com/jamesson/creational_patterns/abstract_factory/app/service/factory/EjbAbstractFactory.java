package br.com.jamesson.creational_patterns.abstract_factory.app.service.factory;

import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarEjbService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserEjbService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserService;

public class EjbAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEjbService();
    }

    @Override
    public CarService getCarService() {
        return new CarEjbService();
    }
    
}
