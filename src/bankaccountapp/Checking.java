package bankaccountapp;

public class Checking extends Account{

	// List properties specific to a checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initilize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit); // to pass name as parameter to main class
		
		accountNumber = "2" + accountNumber;

	}
	// List any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking\n***********");
	}
	
}
