package application;

import java.util.Locale;
import java.util.Scanner;

import exercises.Rectangle;

public class TesteRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = width;
		rectangle.height = height;
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		sc.close();
	}

}
