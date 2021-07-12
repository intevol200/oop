package showGrades;

public class GradeCalculator {
	
	int total = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	
	public void enterGrades(String grade) {
		switch(grade) {
			case "A":
				a = a+1;
				break;
			case "a":
				a = a+1;
				break;
			case "B":
				b = b+1;
				break;
			case "b":
				b = b+1;
				break;
			case "C":
				c = c+1;
				break;
			case "c":
				c = c+1;
				break;
			case "D":
				d = d+1;
				break;
			case "d":
				d = d+1;
				break;
		}
		
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public int getTotal() {
		return total;
	}
	
}
