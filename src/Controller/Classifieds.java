package Controller;

/*
 * This class carries all the variables of table classifieds.
 * This has one constructor and the getters and setters of all variables.
 * 
 * CREATE TABLE Classifieds(classified_id int PRIMARY KEY IDENTITY (1,1) NOT NULL,
product_name nvarchar(30),
headline nvarchar(100),
brand nvarchar(40),
condition nvarchar(20),
descriptions nvarchar(500),
price int,
price_type nvarchar(15),
active_status int not null,
category_id int FOREIGN KEY REFERENCES Category (category_id),
user_id int FOREIGN KEY REFERENCES Users (user_id)
); 
 */
public class Classifieds {

    public int classified_id;
	public String product;
	public String headline;
	public String brand;
	public String condition;
	public String descriptions;
	public int price;
	public String price_type;
	public int active_status;
	public int user_id;
	public int category_id;
	
	public Classifieds(int classified_id,String product, String headline, String brand, String condition, String descriptions, int price,
			String price_type, int active_status,int user_id,int category_id ) {
		super();
		this.classified_id = classified_id;
		this.product = product;
		this.headline = headline;
		this.brand = brand;
		this.condition = condition;
		this.descriptions = descriptions;
		this.price = price;
		this.price_type = price_type;
		this.active_status = active_status;
		this.user_id = user_id;
		this.category_id = category_id;
	}
	
	public Classifieds() {
		
	}

	public int getClassified_id() {
		return classified_id;
	}

	public void setClassified_id(int classified_id) {
		this.classified_id = classified_id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPrice_type() {
		return price_type;
	}

	public void setPrice_type(String price_type) {
		this.price_type = price_type;
	}

	public int getActive_status() {
		return active_status;
	}

	public void setActive_status(int active_status) {
		this.active_status = active_status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	
}
