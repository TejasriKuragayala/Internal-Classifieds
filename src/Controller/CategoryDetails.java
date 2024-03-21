package Controller;

import java.util.Scanner;
import DAO.CategoryDAO;

/*
 * This class is used by admin only to add categories.
 */

public class CategoryDetails {

	public void insertcategory() {
		
		CategoryDAO dao = new CategoryDAO();
		Scanner sc = new Scanner(System.in);
		Category category = new Category();
		
		
		System.out.println("Enter category ID: ");
		category.category_id  = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter category name: ");
		category.category_name  = sc.nextLine();
		
		int result = dao.insert(category);
		  if(result>0) {
			  System.out.println("Category Added in application");  
		  }
		  else {
			  System.out.println("Something went wrong please try again..");
		  }
	}
}
