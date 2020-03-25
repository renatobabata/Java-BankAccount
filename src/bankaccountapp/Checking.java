package bankaccountapp;

public class Checking extends Account{

	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initilize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit); // to pass name as parameter to main class
		
		accountNumber = "2" + accountNumber;
		setDebitCard();

	}
	// List any methods specific to the checking account
	private void setDebitCard(){
		debitCardNumber = (int) (Math.random() * Math.pow(10, 3)); // 3 random digits
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4)); // 4 random digits
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(	"Your Checking Account features"+
							"\nDebit card number: "+debitCardNumber+
							"\nDebit card PIN: "+debitCardPIN);
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
	
}
