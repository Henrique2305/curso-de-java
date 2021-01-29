package application;

import java.util.Locale;
import java.util.Scanner;

import exercises.Student;

public class TesteStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		String name = sc.next();
		double firstGrade = sc.nextDouble();
		double secondGrade = sc.nextDouble();
		double thirdGrade = sc.nextDouble();
		
		student.name = name;
		student.firstGrade = firstGrade;
		student.secondGrade = secondGrade;
		student.thirdGrade = thirdGrade;
		
		System.out.println(student);
		
		if(student.aproved() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS%n", student.leftToPass());
		}
		
		sc.close();
	}

}
