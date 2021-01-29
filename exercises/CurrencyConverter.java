package exercises;

public class CurrencyConverter {
	
	public static double calculatorToDolar(double dolarPrice, double dolarToBought) {
		double aux = dolarToBought * dolarPrice; 
		return aux += aux * 0.06;
	}
}
