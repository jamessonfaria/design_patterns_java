package br.com.jamesson.creational_patterns.abstract_factory.app.service;

import br.com.jamesson.creational_patterns.abstract_factory.app.service.factory.EjbAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.factory.RestAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.factory.ServicesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.CarService;
import br.com.jamesson.creational_patterns.abstract_factory.app.service.services.UserService;

public class Client {
    
    public static void main(String[] args) {
       // ServicesAbstractFactory factory = new RestAbstractFactory();
        ServicesAbstractFactory factory = new EjbAbstractFactory();
        
        UserService userService = factory.getUserService();   
        userService.save("james");
        userService.delete(1);

        CarService carService = factory.getCarService();
        carService.save("gol");
        carService.update("gol 2");

    }    
  
}
