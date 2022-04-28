package br.com.jamesson.creational_patterns.abstract_factory.app.service.services;

public class UserRestApiService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("Saving " + name + " through Rest's interface");
	}

	@Override
	public boolean delete(Integer id) {
		System.out.println("Removing User #" + id + " through Rest's interface");
		return true;
	}
    
}
