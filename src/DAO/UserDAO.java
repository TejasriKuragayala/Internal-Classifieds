package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controller.User;

/*
 * This class implements DAO interface to use its functionalities.
 * It carries 4 methods.
 * Insert, update , delete data from database which can be done by user only.
 * It also carries a method to list down the data of users from database.
 */


public class UserDAO implements DAO<User> {
 
DB db = DB.getDB();

@Override
public int insert(User object) {
	String sql = "INSERT INTO Users(user_id,user_name,email,pasword,active) Values ("+object.getUser_id()+",'"+object.getUsername()+"', '"+object.getEmail()+"','"+object.getPasword()+"',"+object.getActive()+")";
	System.out.println(sql);
	int result = db.executeSQL(sql);
	return result;
}

@Override
public int update(User object) {
	String sql = "update Users set username =  '"+object.getUsername()+"', email = '"+object.getEmail()+"', pasword = '"+object.getPasword()+"' , active = "+object.getActive()+" where user_id = "+object.getUser_id()+"";
	System.out.println(sql);
	
	int result = db.executeSQL(sql);
	return result;
}

@Override
public int delete(User object) {
	String sql = "delete from Users where user_id = "+object.getUser_id(); 
	System.out.println(sql);
	
	int result = db.executeSQL(sql);
	return result;
	
}

@Override
public List query() {
	
	List<User> user = new ArrayList<User>();
	String sql ="select * from Users";
	ResultSet set = db.executeRetrieveQuery(sql);
	
	try {
		while (set.next()) {
			User users = new User();
			users.user_id = set.getInt(1);
			users.username = set.getString(2);
			users.email = set.getString(3);
			users.pasword= set.getString(4);
			
			user.add(users);
			
		}
	} catch (SQLException e) {
		System.out.println("Something went wrong");
		e.printStackTrace();
	}
	return user;
}
	

}
