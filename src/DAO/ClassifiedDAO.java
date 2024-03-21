package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Controller.Classifieds;

/*
 * This class implements DAO interface to use its functionalities.
 * It carries 4 methods.
 * Insert, update , delete data from database which can be done by admin/user only.
 * It also carries a method to list down the data of classifieds from database.
 * 
 */


public class ClassifiedDAO implements DAO<Classifieds> {
	DB db = DB.getDB();
	
	@Override
	public int insert(Classifieds object) {
		String sql = "INSERT INTO Classifieds (product_name,headline,brand,condition, descriptions ,price,price_type,active_status,category_id,user_id) Values ('"+object.getProduct()+"', '"+object.getHeadline()+"','"+object.getBrand()+"','"+object.getCondition()+"' ,'"+object.getDescriptions()+"',"+object.getPrice()+",'"+object.getPrice_type()+"','"+object.getActive_status()+"',"+object.getCategory_id()+", "+object.getUser_id()+")";
        System.out.println(sql);
		
		int result = db.executeSQL(sql);
		return result;
	}

	@Override
	public int update(Classifieds object) {
		String sql = "update Classifieds set product_name = '"+object.getProduct()+"', headline = '"+object.getHeadline()+"', brand = '"+object.getBrand()+"', condition = '"+object.getCondition()+"',descriptions = '"+object.getDescriptions()+"', price = "+object.getPrice()+", price_type = '"+object.getPrice_type()+"' , active_status = '"+object.getActive_status()+"' , category_id = "+object.getCategory_id()+", user_id = "+object.getUser_id()+"   where classified_id = "+object.getClassified_id()+"";
        System.out.println(sql);
		
		int result = db.executeSQL(sql);
		return result;
	}

	@Override
	public int delete(Classifieds object) {
		String sql = "delete from Classifieds where classified_id = "+object.getClassified_id()+"";
        System.out.println(sql);
		
		int result = db.executeSQL(sql);
		return result;
	}

	@Override
	public List<Classifieds> query() {
		List<Classifieds> classified = new ArrayList<Classifieds>();
		String sql ="select * from classified";
		ResultSet set = db.executeRetrieveQuery(sql);
		
		try {
			while (set.next()) {
				Classifieds obj = new Classifieds();
				    
				    obj.classified_id = set.getInt(1);
					obj.product = set.getString(2);
					obj.headline = set.getString(3);
					obj.brand = set.getString(4);
					obj.condition = set.getString(5);
					obj.price = set.getInt(6);
					obj.price_type = set.getString(7);
					obj.user_id = set.getInt(8);
					obj.category_id = set.getInt(9);
					
					classified.add(obj);
			}	
				} 
		  catch (Exception e) {
					System.out.println("Something went wrong");
					e.printStackTrace();
				}
		
		          return classified;
		
	}

}
