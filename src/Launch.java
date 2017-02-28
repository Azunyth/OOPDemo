
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker john = new Worker("John", "DOE");
		
		john.openAccount();
		
		Basket johnBasket = new Basket();
		
		john.setBasket(johnBasket);
		
		Product orange = new Product("Orange", 2.5);
		
		john.getBasket().addToBasket(orange);
		
		john.getBasket().printBill();
		
		Classroom cr = new Classroom();
		
		Student ted = new HighSchool();
		
		cr.addStudent(ted);
		cr.setTeacher(john);
		
	}

}
