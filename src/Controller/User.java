package Controller;

/*
 * This class carries all the variables their constructors, getters and setters of all the user variables
 * CREATE TABLE Users(user_id int PRIMARY KEY,
user_name nvarchar(50) Not Null,
email nvarchar(50) not null,
pasword nvarchar(30) not null,	
);
 */
public class User {

	
	public String username;
	public String email;
	public String pasword;
	public int user_id;
	public int active;
	 
	
	public User(int user_id,String username, String email, String pasword, int active) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.pasword = pasword;
		this.active = active;
		
	}
    public User() {
    	
    }
    
    public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
}
