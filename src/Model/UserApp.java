package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Controller.User;
import DAO.UserDAO;

/*
 * It carries all the functions of user to register account or to login.
 * other user operation methods are called here
 */

public class UserApp {

	public void user() throws Exception {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=OLX;user=amazon;password=teja@123;trustServerCertificate=true");
		System.out.println("connection created");
		Statement smt = con.createStatement();
		
		  UserDAO dao = new UserDAO();
	  	  Scanner sc = new Scanner(System.in);
		  User user = new User();
		  
		System.out.println("Enter\n1: Register\n2: Login\n3:cancel");
		
		System.out.println("Enter Your Choice: ");
		int initialChoice = Integer.parseInt(sc.nextLine());
		
		if(initialChoice == 1) {
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
			  
			  int result = dao.insert(user);
			  if(result>0) {
				  System.out.println(user.username +" Account created"); 
				  UserOperations userone = new UserOperations();
				  userone.userops();
			  }
			  else {
				  System.out.println(user.username +" Something went wrong please try again..");
			  }
		}
		else if(initialChoice == 2) {
			System.out.println("Enter Your Email:");
			String email = sc.nextLine();
			
			System.out.println("Enter Your Password:");
			String pasword = sc.nextLine();
			
			int result = 0;
	          ResultSet set = smt.executeQuery("select count(*) from Users where email = '"+email+"'and pasword = '"+pasword+"';");
	          while (set.next()) {
	            	result = set.getInt(1);
	            }
	            if(result>0) {
	            	System.out.println("User doesn't exist (create account)/ Invalid credentials Please re-enter details\nclose the tab: (");
	            }
	            else {
	              	System.out.println("Login Succesfully");
	              	 UserOperations userone = new UserOperations();
					 userone.userops();
	            }
		}
	       else if(initialChoice == 3) {
	    			System.out.println("Thank You for Using Bus Pass App");
	    			return;
	    		}
	       else {
	    			System.err.println("Invalid Choice...");
	    			System.out.println("Thank You for Using Classifieds App");
	    		}
	}
}
