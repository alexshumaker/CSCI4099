package CSCI4099.lecture2;

public class vendingMachine extends product {

	public vendingMachine(int paymentDollars, int paymentQuarters, String[] items) {

		this.quarters = paymentQuarters;
		this.dollars = paymentDollars;
		this.items = items;
		ProcessOrder();
	}
	
	private void ProcessOrder() {

		int total = (100 * dollars) + (25 * quarters);
		if( (total / 75) < items.length) {
			System.out.println("Error, not enough money input for payment");
			System.exit(1);
		} else if( (total / 75) > items.length) {
			ReturnChange(total);
			// Dispense order here
		} else if ( (total / 75) == items.length) {
			// Dispense order here
		} else {
			System.out.println("An unexpected error has occured");
			System.exit(1);
		}
		
	}
	
	private int ReturnChange(int total) {
		
		total -= items.length * 75;
		if(total > 100) {
			int temp = total % 100;
			// return (temp) number of dollars
		}
		if(total != 0) {
			total /= 25;
			// return (total) number of quarters
		}
		
		return 0;
	}
	
}
