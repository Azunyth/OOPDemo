
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person john = new Person("John", "DOE");
		
		john.openAccount();
		
		Basket johnBasket = new Basket();
		
		john.setBasket(johnBasket);
		
		Product orange = new Product("Orange", 2.5);
		
		john.getBasket().addToBasket(orange);
		
		john.getBasket().printBill();
		
	}

}
