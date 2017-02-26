
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account myAccount = new Account();
		myAccount.viewBalance();
		
		myAccount.credit(100);
		myAccount.viewBalance();
		
		myAccount.debit(70);
		myAccount.viewBalance();
		
	}

}
