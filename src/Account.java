
public class Account {

	/*************************/
	/**      ATTRIBUTS      **/
	/*************************/
	
	private int balance;
	private static int currentId = 0;
	private int id;
	
	
	/*****************************/
	/**      CONSTRUCTEURS      **/
	/*****************************/
	
	// Constructeur par défaut
	public Account() {
		this.balance = 50;
		this.id = ++currentId;
	}
	
	/************************/
	/**      METHODES      **/
	/************************/
	
	// le mot clef "void" signifie que la méthode n'a pas de valeur de retour
	public void credit(int amount) {
		this.balance += amount;
	}
	
	public void debit(int amount) {
		// le mot clef "this" permet d'accéder aux attributs/méthodes d'instance d'une classe
		this.balance += amount;
	}
	
	public void viewBalance() {
		System.out.println("Balance : " + this.balance);
	}
	
	/******************************/
	/**  ACCESSEURS | MUTATEURS  **/
	/******************************/

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
