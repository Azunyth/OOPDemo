
public class Account {

	/*************************/
	/**      ATTRIBUTS      **/
	/*************************/
	
	private int balance;
	
	
	/*****************************/
	/**      CONSTRUCTEURS      **/
	/*****************************/
	
	public Account() {
		this.balance = 50;
	}
	
	/************************/
	/**      METHODES      **/
	/************************/
	
	public void credit(int amount) {
		this.balance += amount;
	}
	
	public void debit(int amount) {
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
	
}
