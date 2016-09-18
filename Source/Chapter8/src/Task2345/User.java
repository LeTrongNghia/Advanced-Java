package Task2345;

/* Author: Lê Trọng Nghia
 * Date: 16/9/2016
 * Version: V1.0
 * Description: define for category controller
 */
public class User {

	String username;
	int id;
	String password;
	
	
	public User() {
		super();
	}

	public User(String username, int id, String password) {
		super();
		this.username = username;
		this.id = id;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
