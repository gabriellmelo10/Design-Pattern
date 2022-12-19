package br.com.cod3r.factory.app.dbadapter.after;

import br.com.cod3r.factory.app.dbadapter.after.db.DB;
import br.com.cod3r.factory.app.dbadapter.after.factory.OracleDBFactory;
import br.com.cod3r.factory.app.dbadapter.after.factory.PostegresDBFactory;

public class Client {

	public static void main(String[] args) {
		//DB db = new PostegresDBFactory().getDatabase();
		DB db = new OracleDBFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
