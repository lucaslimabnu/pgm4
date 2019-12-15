package model;

public class User {

	private String name, username, password;
	private Integer id;
	
	public User() {
		super();
	}

	public User(String name, String username, String password, Integer id) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", password=" + password + ", id=" + id + "]";
	}
	
	
	
}
