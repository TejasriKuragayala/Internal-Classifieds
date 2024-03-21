package Controller;

import java.util.Scanner;
import DAO.UserDAO;

/*
 * This class carries two method of updating user and deleting user.
 * It uses two methods of dao interface.
 */

public class TakingUserDetails {
	
	public void updateuser() {
		UserDAO dao = new UserDAO();
	  	  Scanner sc = new Scanner(System.in);
		  User user = new User();
		  
		  System.out.println("Enter your user id: ");
		  user.user_id = sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Enter your name: ");
		  user.username = sc.nextLine();
		  
		  System.out.println("Enter your email id: ");
		  user.email = sc.nextLine();
		  
		  System.out.println("Enter your password: ");
		  user.pasword = sc.nextLine();
	  	  
		  user.active = 0;
		  
		  int result = dao.update(user);
		  if(result>0) {
			  System.out.println(user.username +" Account created"); 
			  System.out.println("Wait for admin approval to activate your profile");
			  
		  }
		  else {
			  System.out.println(user.username +" Something went wrong please try again..");
		  }
	}
	
	public void deleteuser() {
		UserDAO dao = new UserDAO();
	  	  Scanner sc = new Scanner(System.in);
		  User user = new User();
		  
		  System.out.println("Enter your user id: ");
		  user.user_id = sc.nextInt();
		 
		  int result = dao.delete(user);
		  if(result>0) {
			  System.out.println(user.username +"Something went wrong please try again.."); 
			  
		  }
		  else {
			  System.out.println(user.username +"Account deleted");
		  }
}
}