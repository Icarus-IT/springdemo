package cybersoft.java12.springdemo.dbconnection;

public class PgConnection implements DatabaseConnection {
	private DbDataSource dataSource;
	public PgConnection(DbDataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = dataSource;
	}
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("Got PostgreSQL Connection");
	}
}
