package cybersoft.java12.springdemo.container;

import cybersoft.java12.springdemo.dbconnection.DbDataSource;
import cybersoft.java12.springdemo.dbconnection.MySqlConnection;
import cybersoft.java12.springdemo.dbconnection.PgConnection;

public class IoCContainer {
	private static MySqlConnection mySqlConnection=null;
	private static PgConnection pgSqlConnection=null;
	private static DbDataSource dataSource = null;
	public static Object getBean(String beanName) {
		switch (beanName) {
		case "mySqlConnection":
			return getMySqlConnection();
		case "pgSqlConnection":
			return getPgSqlConnection();
		case "dataSource":
			return getDataSource();
		default:
			break;
		}
		return null;
	}

	private static Object getDataSource() {
		// TODO Auto-generated method stub
		return  pgSqlConnection== null ? new DbDataSource("","",""):
			dataSource;
	}

	private static Object getPgSqlConnection() {
		// TODO Auto-generated method stub
		return  pgSqlConnection== null ? new PgConnection((DbDataSource) getDataSource()):
			pgSqlConnection;
	}

	private static Object getMySqlConnection() {
		// TODO Auto-generated method stub
		return  mySqlConnection== null ? new MySqlConnection((DbDataSource) getDataSource()):
			mySqlConnection;
	}
}
