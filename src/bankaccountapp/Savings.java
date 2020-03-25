package bankaccountapp;

public class Savings extends Account{

	// List properties specific to the Saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initilize settings for the Saving properties
	public Savings(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit); // to pass name as parameter to main class

		accountNumber = "1" + accountNumber;
		
		setSafetyDepositBox();
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3)); // 3 random digits
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4)); // 4 random digits
	}
	
	// List any methods to savings account
	
	public void showInfo() {
		super.showInfo();
		System.out.println( "Your Savings Account Features"+
							"\nSafety Deposit Box ID: "+safetyDepositBoxID+
							"\nSafety Deposit Box Key: "+safetyDepositBoxKey);
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
}
