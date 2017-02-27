import java.util.ArrayList;

public class Basket {
	
	public ArrayList<Product> products;
	public double bill;
	
	public Basket() {
		this.products = new ArrayList<Product>();
		this.bill = 0;
	}
	
	public void addToBasket(Product p) {
		this.products.add(p);
		this.calcTotalBasket();
	}
	
	public void removeToBasket(int index) {
		this.products.remove(index);
		this.calcTotalBasket();
	}
	
	public void displayBasket() {
		for(Product p : this.products) {
			System.out.println(p.getName());
		}
	}
	
	public void printBill() {
		System.out.println(this.bill);
	}
	
	public void calcTotalBasket() {
		this.bill = 0;
		for(Product p : this.products) {
			this.bill += p.getPrice();
		}
	}
	
}
