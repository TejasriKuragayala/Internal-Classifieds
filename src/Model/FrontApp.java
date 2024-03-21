package Model;

/*
 * This class is the front page application which will ask to select admin or user
 * This carries a witch case.
 */
import java.util.Scanner;

public class FrontApp {
	public void frontpage() throws Exception{
		Scanner sc = new Scanner(System.in);
        int menu;
        
        System.out.println("1: Admin\n2: User\n3: Exit\nSelect an option");
        menu = sc.nextInt();
        
        do {
        	switch(menu) {
        	case 1: 
        		AdminClassifieds classifieds = new AdminClassifieds();
        		classifieds.admin();
        		break;
        	case 2:
        		UserApp user = new UserApp();
        		user.user();
        		break;
        	case 3:
        		System.out.println("Thank you for using application");
        		break;
        	}
        	
        } while(menu != 3);
        sc.close();
	}
}
