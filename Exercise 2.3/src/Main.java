
public class Main {
	public static void main(String[]args) {
	
		Motorcycle Brand1 = new Motorcycle(); //create first new object Motorcycle 
		Brand1.printMotorcycle();
		System.out.println();
		Brand1.calcPrice();
		System.out.println();
		Brand1.calcMonthlyPayment();
		System.out.println();
		Brand1.calcFuelPrice();
		
		System.out.println();
		
		Motorcycle Brand2 = new Motorcycle(); //create second new object Motorcycle
		Brand2.printMotorcycle();
		System.out.println();
		Brand2.calcPrice();
		System.out.println();
		Brand2.calcMonthlyPayment();
		System.out.println();
		Brand2.calcFuelPrice();
		
	}

}