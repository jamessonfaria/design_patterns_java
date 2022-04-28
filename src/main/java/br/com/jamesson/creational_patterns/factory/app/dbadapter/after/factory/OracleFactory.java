package br.com.jamesson.creational_patterns.factory.app.dbadapter.after.factory;

import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.db.DB;
import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
