package bankaccountapp;

public interface IRate {

	// Write a method that returns the method base rate
	default double getBaseRate() {
		return 2.5;
	}
	
}
