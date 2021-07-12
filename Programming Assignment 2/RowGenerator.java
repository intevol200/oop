package drawRows;

import java.util.Scanner;

public class RowGenerator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numb1 = 0;
		int numb2 = 0;
		int numb3 = 0;
		int numb4 = 0;
		int numb5 = 0;
		int i = 0;
		
		System.out.print("Enter the number between 1 to 30: ");
		numb1 = input.nextInt();
		
		while(numb1 < 1 || numb1 >30) {
			System.out.print("WRONG NUMBER!!(ENTER THE NUMBER BETWEEN 1 TO 30): ");
			numb1 = input.nextInt();
		}
		
		System.out.print("Enter the number between 1 to 30: ");
		numb2 = input.nextInt();
		
		while(numb2 < 1 || numb2 >30) {
			System.out.print("WRONG NUMBER!!(ENTER THE NUMBER BETWEEN 1 TO 30): ");
			numb2 = input.nextInt();
		}
		
		System.out.print("Enter the number between 1 to 30: ");
		numb3 = input.nextInt();
		
		while(numb3 < 1 || numb3 >30) {
			System.out.print("WRONG NUMBER!!(ENTER THE NUMBER BETWEEN 1 TO 30): ");
			numb3 = input.nextInt();
		}
		
		System.out.print("Enter the number between 1 to 30: ");
		numb4 = input.nextInt();
		
		while(numb4 < 1 || numb4 >30) {
			System.out.print("WRONG NUMBER!!(ENTER THE NUMBER BETWEEN 1 TO 30): ");
			numb4 = input.nextInt();
		}
		
		System.out.print("Enter the number between 1 to 30: ");
		numb5 = input.nextInt();
		
		while(numb5 < 1 || numb5 >30) {
			System.out.print("WRONG NUMBER!!(ENTER THE NUMBER BETWEEN 1 TO 30): ");
			numb5 = input.nextInt();
		}		
		
		System.out.println();

		
		for(i=0; i<numb1; i++) {
			System.out.print("*");
		}
		System.out.println();

		
		for(i=0; i<numb2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for(i=0; i<numb3; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for(i=0; i<numb4; i++) {
			System.out.print("*");
		}
		System.out.println();

		
		for(i=0; i<numb5; i++) {
			System.out.print("*");
		}
		
	}
}	