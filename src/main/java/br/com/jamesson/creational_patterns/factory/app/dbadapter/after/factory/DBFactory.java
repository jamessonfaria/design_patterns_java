package br.com.jamesson.creational_patterns.factory.app.dbadapter.after.factory;

import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
