package br.com.jamesson.creational_patterns.factory.app.dbadapter.before.db.db;

public class OracleDB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Oracle database");
	}
}
