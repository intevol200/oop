package calDigit;

import java.util.Scanner;

public class CalculateDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int digit;
		int number;
		int sum = 0;
		
		System.out.print("Enter the number: ");
		number = input.nextInt();
		
        while(number != 0) {
        	
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            
        }
		
		System.out.print("Sum of each element of your number is " + sum);
		
	}
	
}
