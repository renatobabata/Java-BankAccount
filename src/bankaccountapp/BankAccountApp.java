package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {

		Checking checking = new Checking("Renato","123456789",1500);
		
		Savings saving = new Savings("Seiji","987654321",2500);
		
		checking.showInfo();
		saving.showInfo();
	}

}
