package br.com.jamesson.creational_patterns.factory.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
