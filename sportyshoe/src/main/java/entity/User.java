package entity;

import javax.annotation.processing.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name="users")
public class User {
	
	@Id
	@jakarta.annotation.Generated(strategy=Generated.IDENTITY, value = { "" })
	@Column(name="id")
	private int id;
	
	@Column(name="type")
	private int type;
	
	@Column(name="username")
	private String username;
	
	
	@Column(name="password")
	private String password;
	
	@Range(min=1, max=120,message = "Invalied Age") 
	 
	@Column(name="age")
	private int age;

	public User() {

	}
	
	
	

	public User(String username, String password, int age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", type=" + type + ", username=" + username + ", password=" + password + ", age="
				+ age + "]";
	}
	
	
	
	
	
	

}
