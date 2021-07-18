package cybersoft.java12.springdemo.dbconnection;

public class MySqlConnection implements DatabaseConnection{
	private DbDataSource dataSource;
	public MySqlConnection(DbDataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = dataSource;
	}
	@Override
	public void getConnection() {
		System.out.println("Got MySqlConnection");
	}
	
}
