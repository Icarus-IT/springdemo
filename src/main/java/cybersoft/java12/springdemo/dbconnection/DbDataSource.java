package cybersoft.java12.springdemo.dbconnection;

public class DbDataSource {
	private String url;
	private String name;
	private String password;
	public DbDataSource() {
		// TODO Auto-generated constructor stub
	}
	
	public DbDataSource(String url, String name, String password) {
	
		this.url = url;
		this.name = name;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
