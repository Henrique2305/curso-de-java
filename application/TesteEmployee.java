package application;

import java.util.Locale;
import java.util.Scanner;

import exercises.Employee;

public class TesteEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Gross salary: ");
		double salary = sc.nextDouble();
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		
		employee.name = name;
		employee.grossSalary = salary;
		employee.tax = tax;
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
		
	}

}
