
public class Product {

	public String name;
	public double price;
	
	public Product(String prodName, double prodPrice) {
		this.name = prodName;
		this.price = prodPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
