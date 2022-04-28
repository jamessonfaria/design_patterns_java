package br.com.jamesson.creational_patterns.abstract_factory.app.service.factory;

import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarRestApiService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserRestApiService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory{

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
    
}
