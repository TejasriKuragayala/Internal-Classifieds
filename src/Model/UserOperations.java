package Model;

import java.util.Scanner;
import Controller.DeleteClassified;
import Controller.TakingUserDetails;
import Controller.UpdateClassified;
import Controller.UserInsert;

/*
 * This class carries one method in which all the user operations object are there in switch case.
 */

public class UserOperations {
	public void userops() {
	Scanner sc = new Scanner(System.in);
	int operations;
	
	do {
		System.out.println("1:Insert classified\n2:Update your profile\n3:Delete your profile\n4:My Profile\n5:Update Classified\n6:Delete classified\n7: Exit");
		operations = sc.nextInt();
		switch(operations) {
		case 1: 
			UserInsert insert = new UserInsert();
			insert.insertdetails();
			break;
		case 2: 
			TakingUserDetails update = new TakingUserDetails();
			update.updateuser();
			break;
		case 3: 
			TakingUserDetails delete = new TakingUserDetails();
			delete.deleteuser();
			break;
		case 4: 
			System.out.println("Enter User Id: ");
			int id = sc.nextInt();
			String sql = "select * from Users where user_id = "+id+"";
			System.out.println(sql);
			break;
		case 5: 
			UpdateClassified update1 = new UpdateClassified();
			update1.updatedetails();
			break;
		case 6: 
			DeleteClassified delete1 = new DeleteClassified();
			delete1.deletedetails();
			break;
		case 7:
			System.out.println("Thank you for using user app");
			break;
		default :
			System.out.println("Wrong input");
			break;
		}
	} while(operations != 7);
}
}
