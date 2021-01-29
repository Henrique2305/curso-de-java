package exercises;

public class Student {

	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double sumGrades() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public String aproved() {
		if(sumGrades() < 60.00) {
			return "FAILED";
		}
		else {
			return "PASS";
		}
	}
	
	public double leftToPass() {
		double calculus = 0;
		if(aproved() == "FAILED") {
			calculus = 60.00 - sumGrades();
		}
		return calculus;
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", sumGrades()) +
				aproved();
	}
}
