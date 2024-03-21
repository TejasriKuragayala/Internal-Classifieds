package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Controller.Category;

/*
 * This class implements DAO interface to use its functionalities.
 * It carries 4 methods. but we need only 2 methods.
 * Insert, update , delete data from database which can be done by admin only.
 * It also carries a method to list down the data of categories from database.
 */


public class CategoryDAO implements DAO<Category>{
	DB db = DB.getDB();
	@Override
	public int insert(Category object) {
		String sql = "INSERT INTO Category (category_id,category_name)values("+object.getCategory_id()+",'"+object.getCategory_name()+"')";
        System.out.println(sql);
		
		int result = db.executeSQL(sql);
		return result;
	}

	@Override
	public int update(Category object) {
		return 0;
	}

	@Override
	public int delete(Category object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> query() {
		List<Category> category = new ArrayList<Category>();
		String sql ="select * from category";
		ResultSet set = db.executeRetrieveQuery(sql);
		
		try {
			while (set.next()) {
				Category obj = new Category();
				    
				    obj.category_id = set.getInt(1);
					obj.category_name = set.getString(2);
				
					category.add(obj);
			}	
				} 
		  catch (Exception e) {
					System.out.println("Something went wrong");
					e.printStackTrace();
				}
		return category;
	}

}
