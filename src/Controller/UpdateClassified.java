package Controller;

import java.util.Scanner;
import DAO.ClassifiedDAO;

/*
 * This class used to update classiified.
 * Method of this class has been used by both admin and user.
 * this class is using one of the dao class method.
 */

public class UpdateClassified {
	
	 public void updatedetails() {
		  ClassifiedDAO dao = new ClassifiedDAO();
			Scanner sc = new Scanner(System.in);
			Classifieds admin = new Classifieds();
			
			System.out.println("Enter classified id: ");
		    admin.classified_id  = sc.nextInt();
		    
			System.out.println("Enter category id: ");
		    admin.category_id  = sc.nextInt();
		    
		    System.out.println("Enter user id: ");
		    admin.user_id  = sc.nextInt();
		    sc.nextLine();
		    
			System.out.println("Enter Product name: ");
		    admin.product  = sc.nextLine();
		    
		    System.out.println("Enter Headline for the product: ");
		    admin.headline  = sc.nextLine();
		    
		    System.out.println("Enter Brand of the product(If Any): ");
		    admin.brand  = sc.nextLine();
		    
		    System.out.println("Enter condition of product\n1: Brand new(Seal Packed)\n2: Lightly Used\n3: Moderately Used\n4: Heavily Used\n5: Damaged/Dented\n6: Not Working : ");
		    admin.condition  = sc.nextLine();
			if(admin.condition.equals("1")) {
				admin.condition = "Brand New";
			}
			else if(admin.condition.equals("2")) {
				admin.condition = "Lightly Used";
			}
			else if(admin.condition.equals("3")) {
				admin.condition = "Moderately used";
			}
			else if(admin.condition.equals("4")) {
				admin.condition = "Heavily Used";
			}
			else if(admin.condition.equals("5")) {
				admin.condition = "Damaged/Dented";
			}
			else if(admin.condition.equals("6")) {
				admin.condition = "Not Working";
			}
			else {
				System.out.println("Wrong input");
				return;
			}
			System.out.println("Enter Description of the product: ");
		    admin.descriptions  = sc.nextLine();
		    
		    System.out.println("Enter Price of product: ");
		    admin.price  = sc.nextInt();
		    sc.nextLine();
		    
		    System.out.println("Enter type of price one time or recurring\n1: One time\n2: Per Month\n3: Per quater\n4: Semi Quater \n5: Per year: ");
		    admin.price_type  = sc.nextLine();
		    
		    if(admin.price_type.equals("1")) {
				admin.price_type = "One time";
			}
		    else if(admin.price_type.equals("2")) {
				admin.price_type = "Per Month";
			}
		    else if(admin.price_type.equals("3")) {
				admin.price_type = "Per quater";
			}
		    else if(admin.price_type.equals("4")) {
				admin.price_type = "Semi Quater";
			}
		    else if(admin.price_type.equals("5")) {
				admin.price_type = "Per year";
			}
		    else {
				System.out.println("Wrong input");
				return;
			}
		    int result = dao.update(admin);
			  if(result>0) {
				  System.out.println("Classified updated"); 
			  }
			  else {
				  System.out.println("Something went wrong please try again..");
			  }
	  }
}
