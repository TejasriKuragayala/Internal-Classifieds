package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * This class used by admin.
 * This is used to approve / reject classifieds posted by user.
 * This carries one method which switch case.
 */

public class ApproveRejectClassified {
 
	public void approvereject() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=OLX;user=amazon;password=teja@123;trustServerCertificate=true");
		
		Statement smt = con.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter\n1: Approve\n2: Reject ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Classified id: ");
			int id = sc.nextInt();
			
			int result = smt.executeUpdate("update Classifieds set active_status = 1 where classified_id = "+id+"");
			System.out.println(result>0 ? "User classified approved": "something went wrong" );
		}
		else if (choice == 2) {
			System.out.println("Enter Classified id: ");
			int id = sc.nextInt();
			
			int result1 = smt.executeUpdate("update Classifieds set active_status = 0 where classified_id = "+id+"");
			System.out.println(result1>0 ? "User classified rejected": "something went wrong" );
		}
	
		else {
			System.out.println("Wrong input");	
		}
	}
	
}
