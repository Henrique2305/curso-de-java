package application;

import java.util.Locale;
import java.util.Scanner;

import exercises.CurrencyConverter;

public class TesteCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", 
				CurrencyConverter.calculatorToDolar(price, dollars));
		
		sc.close();
	}

}
