package Controller;

import java.util.List;
import java.util.Scanner;
import DAO.CategoryDAO;
import DAO.ClassifiedDAO;

/*
 * This class is used to insert classifieds by user.
 * In this active status of classified posted by user will be 0 i.e not active.
 * It will change to 1 i.e active only when admin approves the classified.
 */

public class UserInsert {
	
   public void insertdetails() {
		
		ClassifiedDAO dao = new ClassifiedDAO();
		Scanner sc = new Scanner(System.in);
		Classifieds admin_user = new Classifieds();
		
		CategoryDAO list = new CategoryDAO();
		List<Category> categories = list.query();
		for(Category category : categories) {
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(category);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		System.out.println("Enter your user id: ");
		admin_user.user_id  = sc.nextInt();
		
		System.out.println("Enter category id from above list: ");
		admin_user.category_id  = sc.nextInt();
	    sc.nextLine();
	    
		System.out.println("Enter Product name: ");
		admin_user.product  = sc.nextLine();
	    
	    System.out.println("Enter Headline for the product: ");
	    admin_user.headline  = sc.nextLine();
	    
	    System.out.println("Enter Brand of the product(If Any): ");
	    admin_user.brand  = sc.nextLine();
	    
	    System.out.println("Enter condition of product\n1: Brand new(Seal Packed)\n2: Lightly Used\n3: Moderately Used\n4: Heavily Used\n5: Damaged/Dented\n6: Not Working : ");
	    admin_user.condition  = sc.nextLine();
		if(admin_user.condition.equals("1")) {
			admin_user.condition = "Brand New";
		}
		else if(admin_user.condition.equals("2")) {
			admin_user.condition = "Lightly Used";
		}
		else if(admin_user.condition.equals("3")) {
			admin_user.condition = "Moderately used";
		}
		else if(admin_user.condition.equals("4")) {
			admin_user.condition = "Heavily Used";
		}
		else if(admin_user.condition.equals("5")) {
			admin_user.condition = "Damaged/Dented";
		}
		else if(admin_user.condition.equals("6")) {
			admin_user.condition = "Not Working";
		}
		else {
			System.out.println("Wrong input");
			return;
		}
		System.out.println("Enter Description of the product: ");
		admin_user.descriptions  = sc.nextLine();
	    
	    System.out.println("Enter Price of product: ");
	    admin_user.price  = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Enter type of price one time or recurring\n1: One time\n2: Per Month\n3: Per quater\n4: Semi Quater \n5: Per year: ");
	    admin_user.price_type  = sc.nextLine();
	    
	    if(admin_user.price_type.equals("1")) {
	    	admin_user.price_type = "One time";
		}
	    else if(admin_user.price_type.equals("2")) {
	    	admin_user.price_type = "Per Month";
		}
	    else if(admin_user.price_type.equals("3")) {
	    	admin_user.price_type = "Per quater";
		}
	    else if(admin_user.price_type.equals("4")) {
	    	admin_user.price_type = "Semi Quater";
		}
	    else if(admin_user.price_type.equals("5")) {
	    	admin_user.price_type = "Per year";
		}
	    else {
			System.out.println("Wrong input");
			return;
		}
	    
	    admin_user.active_status = 0;
	    
	    int result = dao.insert(admin_user);
		  if(result>0) {
			  System.out.println("Classified Added in application"); 
			  System.out.println("Wait for admin approval to make classified public"); 
			  
		  }
		  else {
			  System.out.println("Something went wrong please try again..");
		  }
}
}

