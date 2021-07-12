package showGrades;

import java.util.Scanner;

	public class GradeCalculatorTest {
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		GradeCalculator cal = new GradeCalculator();
		
		String grade;
		int count = 0;
		String name;
		int total = 0;
		
		while(count < 5) {
			System.out.print("Enter the name: ");
			name = input.next();
			total = total + 1;
			
			System.out.print("Enter the grade: ");
			grade = input.next();
			
			cal.enterGrades(grade);
			count = count + 1;
		}
		
		System.out.println();
		
		System.out.println("Total number of students: " + total);
		System.out.println("A : " + cal.getA());
		System.out.println("B : " + cal.getB());
		System.out.println("C : " + cal.getC());
		System.out.println("D : " + cal.getD());
	}	
}
