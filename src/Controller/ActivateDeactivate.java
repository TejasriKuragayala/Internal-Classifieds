package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This class is used by admin only.
 * When a new user creates account in app its active status for using app further is inactive ie. 0
 * With this class admin approves rejects user status to use app features.
 */

public class ActivateDeactivate {
  
	public void userstatus() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=OLX;user=amazon;password=teja@123;trustServerCertificate=true");
		
		Statement smt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter\n1: Activate\n2: Deactivate ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter user id: ");
			int id = sc.nextInt();
			
			int result = smt.executeUpdate("update Users set active = 1 where user_id = "+id+"");
			System.out.println(result>0 ? "User status activated": "something went wrong" );
		}
		else if (choice == 2) {
			System.out.println("Enter user id: ");
			int id = sc.nextInt();
			
			int result1 = smt.executeUpdate("update Users set active = 0 where user_id = "+id+"");
			System.out.println(result1>0 ? "User sstatus deactivated": "something went wrong" );
		}
	
		else {
			System.out.println("Wrong input");	
		}
		return;
	}

}
