package salescalculator;

public class SalesCal {
	private static double basic = 200;
	private static double commision = 0.09;
	private static double total;
	
	public void enterItems(int x) {
		switch(x) {
			case 1:
				total += 239.99;
				break;
			case 2:
				total += 129.75;
				break;
			case 3:
				total += 99.95;
				break;
			case 4:
				total += 350.89;
				break;
			default:
				break;
		}
	}
	
	public double getTotal() {
		return total;
	}
	
	public double calculate() {
		return basic + total * commision;
	}
}
