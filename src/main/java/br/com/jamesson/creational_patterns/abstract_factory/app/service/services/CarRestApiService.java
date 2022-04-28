package br.com.jamesson.creational_patterns.abstract_factory.app.service.services;

public class CarRestApiService implements CarService {
    @Override
	public void save(String model) {
		System.out.println("Saving " + model + " car through Rest's interface");
	}

	@Override
	public void update(String newModel) {
		System.out.println("Updating " + newModel + " car through Rest's interface");
	}
}
