package Models;

public class User {

	private int idU;
	private String username;
	private String email;
	private String password;
	
	public User(String u,String e,String mp) {
		username=u;
		email=e;
		password=mp;
		
	}
	
	public int getId() {
		return this.idU;
	}
	public void setId(int id) {
		this.idU=id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUserName(String n) {
		this.username=n;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String e) {
		this.email=e;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String mp) {
		this.password=mp;
	}}