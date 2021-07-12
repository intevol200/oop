package tempConversion;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choose;
		double numb;
		
		System.out.print("Choose target temperature(1 is Kelvin, 2 is Celsius): ");
		choose = input.nextInt();
		
			if(choose == 1) {
				System.out.print("Enter Kelvin temperature: ");
				numb = input.nextDouble();
				System.out.print("Celcius temperature is " + Celsius(numb));
			}
			
			if(choose == 2) {
				System.out.print("Enter Celcius temperature: ");
				numb = input.nextDouble();
				System.out.print("Kelvin temperature is " + Kelvin(numb));

		}
	}
	
	
	private static double Kelvin;
	private static double Celsius;
	
	public static double Celsius(double numb) {
		Kelvin = numb;
		Celsius = Kelvin - 273.15;
		return Celsius;
	}
	
	public static double Kelvin(double numb) {
		Celsius = numb;
		Kelvin = Celsius + 273.15;
		return Kelvin;
	}
	
}
