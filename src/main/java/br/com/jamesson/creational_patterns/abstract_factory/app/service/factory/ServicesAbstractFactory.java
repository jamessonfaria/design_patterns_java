package br.com.jamesson.creational_patterns.abstract_factory.app.service.factory;

import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserService;

public interface ServicesAbstractFactory {
    public UserService getUserService();
    public CarService getCarService();
}
