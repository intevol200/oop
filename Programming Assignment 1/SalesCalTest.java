package salescalculator;

import java.util.Scanner;

public class SalesCalTest {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		SalesCal b = new SalesCal();
		
		int numb = 0;
		
		while(numb != -1) {
			System.out.print("Enter the number of the item on the list\n(press -1 to finish calculating): ");
			numb = a.nextInt();
			
			b.enterItems(numb);
		}
		
		if(b.getTotal() > 0) {
			System.out.printf("Total sales : %.2f\n", b.getTotal());
			System.out.printf("Total amount of money: %.2f\n", b.calculate());
		}
	}
}
