package Controller;

/*
 * This class carries variables constructor and getter setter of all the variables.
 * 
 * CREATE TABLE Category(category_id int PRIMARY KEY Not Null,
category_name nvarchar(20));
 */
public class Category {

	public int category_id;
	public String category_name;
	
	public Category() {
		
	}
	public Category(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	public String toString() {
 		return "Category [category_id=" + category_id + ", category_name=" + category_name+" ]";
 	}
	
}
