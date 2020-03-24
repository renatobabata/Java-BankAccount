package bankaccountapp;

public class Savings extends Account{

	// List properties specific to the Saving account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initilize settings for the Saving properties
	public Savings(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit); // to pass name as parameter to main class

		accountNumber = "1" + accountNumber;

	}
	// List any methods to savings account
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings\n***********");
	}
}
