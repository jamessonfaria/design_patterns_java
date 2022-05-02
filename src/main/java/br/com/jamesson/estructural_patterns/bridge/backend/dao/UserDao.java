package br.com.jamesson.estructural_patterns.bridge.backend.dao;

import br.com.jamesson.estructural_patterns.bridge.backend.model.User;

public interface UserDao {
	void save(User user);
}
