
public class Person {

	/*************************/
	/**      ATTRIBUTS      **/
	/*************************/
	
	private String firstname;
	private String lastname;
	private int age;
	private String city;
	private Account account;
	private Basket basket;
	
	/*****************************/
	/**      CONSTRUCTEURS      **/
	/*****************************/
	
	public Person() {
		
	}
	
	public Person(String fname, String lname) {
		this();
		this.firstname = fname;
		this.lastname = lname;
	}
	
	/************************/
	/**      METHODES      **/
	/************************/
	
	public void openAccount() {
		if(this.account == null){
			this.account = new Account();
		}
	}
	
	public void payBasket() {
		if(this.account.canDebit(this.basket.getBill())) {
			// il ne faudrait pas cast en int mais tout changer en double
			this.account.debit((int)this.basket.getBill());
		}
	}
	
	/******************************/
	/**  ACCESSEURS | MUTATEURS  **/
	/******************************/

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
}
