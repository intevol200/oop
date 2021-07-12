package assignment7;

import java.util.Scanner;

public class DeleteDuplicate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int temp;

		for(int i = 0; i < 10; i++) {
			System.out.print("Enter the number between 10 to 100(" + (i + 1) + ") : ");
			int element = input.nextInt();
			array[i] = element;
			
			for(int j = 0; j < 10; j++) {
				if(array[i] == array[j]) {
					temp = array[i];
					array[j] = -1;
					array[i] = temp;
					
				}
			}
			
			while(element < 10 || element > 100) {
				System.out.print("WRONG NUMBER! TRY TO ENTER THE NUMBER BETWEEN 10 TO 100: ");
				element = input.nextInt();
				array[i] = element;
				
				for(int j = 0; j < 10; j++) {
					if(array[i] == array[j]) {
						temp = array[i];
						array[j] = -1;
						array[i] = temp;
						
					}
				}
			}
		}
				
		System.out.println();
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int j = 0; j < 10; j++) {
			if(array[j] != -1) {
				System.out.printf("%5d%8d%n", (j + 1), array[j]);
			}
		}
	}
}