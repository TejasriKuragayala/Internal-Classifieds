package Model;

import java.util.Scanner;
import Controller.ActivateDeactivate;
import Controller.AdminInsert;
import Controller.ApproveRejectClassified;
import Controller.CategoryDetails;
import Controller.DeleteClassified;
import Controller.UpdateClassified;

/*
 * This class has one method with switch case
 * It is calling all the method of admin through objects in switch case.
 */

public class AdminClassifieds {

	public void admin() throws Exception {
		final String admin = "teja@mail.com";
		final String password = "teja@123";
		
		Scanner sc = new Scanner(System.in);
		int operations;
		System.out.println("Enter admin id: ");
		String name = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		if(name.equals(admin)&&pwd.equals(password)) {
			System.out.println("Succesfully Logged In continue with operations");

			{
			System.out.println("1:Insert classified\n2:Update classified\n3: Delete classified\n4:Approve/Reject classifieds\n5: Activate/Deactivate users\n6:Add categories\n7: Exit");
			operations = sc.nextInt();
			switch(operations) {
			case 1: 
				AdminInsert insert = new AdminInsert();
				insert.admininsert();
				break;
			case 2: 
				UpdateClassified update = new UpdateClassified();
				update.updatedetails();
				break;
			case 3: 
				DeleteClassified delete = new DeleteClassified();
				delete.deletedetails();
				break;
			case 4: 
				ApproveRejectClassified status = new ApproveRejectClassified();
				status.approvereject();
				break;
			case 5: 
				ActivateDeactivate activestatus = new ActivateDeactivate();
				activestatus.userstatus();
				break;
			case 6: 
				CategoryDetails insertion = new CategoryDetails();
				insertion.insertcategory();
				break;
			case 7: 
				System.out.println("Thank you");
				break;
			default :
				System.out.println("Wrong input");
				break;
			}
		} while(operations != 7);
			
			}
		else {
			System.out.println("Try again");
		}
	      return;
	}
	
	}

