package Controller;

import java.util.Scanner;
import DAO.ClassifiedDAO;

/*
 * This class use to delete classified.
 * This can be used by both user and admin.
 */
public class DeleteClassified {
	  public void deletedetails() {
		  ClassifiedDAO dao = new ClassifiedDAO();
			Scanner sc = new Scanner(System.in);
			Classifieds admin = new Classifieds();
			
			System.out.println("Enter classified id: ");
		    admin.classified_id  = sc.nextInt();
		    
		    int result = dao.delete(admin);
			  if(result>0) {
				  System.out.println("Classified Deleted"); 
			  }
			  else {
				  System.out.println("Something went wrong please try again..");
			  }
	  }
}
