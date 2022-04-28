package br.com.jamesson.creational_patterns.factory.app.dbadapter.after;

import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.db.DB;
import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.factory.OracleFactory;
import br.com.jamesson.creational_patterns.factory.app.dbadapter.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db2 = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
