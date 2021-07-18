package cybersoft.java12.springdemo.model;

public class Author {
	private String name;
	private String email;
	private String facebook;
	
	public Author() {
		// TODO Auto-generated constructor stub
		name = "Vo Nhut Thanh Long";
		email = "contact@long.dev";
		facebook = "https://www.facebook.com/LongVNT.IT";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	
	
}
