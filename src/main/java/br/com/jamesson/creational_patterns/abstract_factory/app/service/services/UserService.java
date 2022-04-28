package br.com.jamesson.creational_patterns.abstract_factory.app.service.services;

public interface UserService {
    void save(String name);
	boolean delete(Integer id);
}
