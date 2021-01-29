package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class TesteProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		Product produto = new Product(name, price);
		
		System.out.println();
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		int removeItems = sc.nextInt();
		produto.removeProducts(removeItems);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
	}

}
