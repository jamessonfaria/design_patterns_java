package br.com.jamesson.estructural_patterns.bridge.backend.services;

import br.com.jamesson.estructural_patterns.bridge.backend.dao.UserDao;
import br.com.jamesson.estructural_patterns.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
