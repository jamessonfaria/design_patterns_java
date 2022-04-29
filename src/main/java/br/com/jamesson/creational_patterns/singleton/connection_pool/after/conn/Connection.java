package br.com.jamesson.creational_patterns.singleton.connection_pool.after.conn;

public class Connection {
	private boolean inUse;

	public Connection() {
		inUse = false;
	}

	public Object query(String sql) {
		System.out.println("Running '" + sql + "' in Connection " + this);
		return null;
	}

	boolean isInUse() {
		return inUse;
	}

	void setInUse(boolean status) {
		inUse = status;
	}
}
