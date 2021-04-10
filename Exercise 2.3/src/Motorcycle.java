import java.util.Scanner;

	public class Motorcycle {
		
		Scanner s = new Scanner(System.in);

		void printMotorcycle() {
			
			System.out.println("Enter Brand, Model, Colour, Type : ");
			String b = s.nextLine();
			String m =s.nextLine();
			String c = s.nextLine();
			String t = s.next();
			
			System.out.println("Brand : " + b);
			System.out.println("Model : " + m);
			System.out.println("Colour : " + c);
			System.out.println("Type : " + t);
		}
		
		void calcPrice(){
			
			System.out.println(" Please Enter The Price And Quantity : ");
			int p = s.nextInt(); 
			int q = s.nextInt();
			
			int TP = p*q;
			System.out.println("Total Price = RM" + TP);
		}
		
		void calcMonthlyPayment() {
			
			double r = 0.0138; 
			double DP = 0.20; 
			double MP = 0;
			
			System.out.print("Please Enter The Price : RM");
			int p = s.nextInt();
			System.out.println("Price = RM" + p);
			
			MP = p-p*DP;
			System.out.println("Balance Payment = RM" +MP);
					
			double i = MP*r;
			System.out.println("Interest = RM" +i); 
			
			double t = (MP + i)/12; 
			System.out.printf("Total Monthly Payment = RM%.2f\n",t); 
			
		}

		 void calcFuelPrice() {
			 double price;
			 System.out.println("Please Enter The Amount Of The Fuel (L) : ");
			 int L = s.nextInt();
			 price=2.30*L;
			 System.out.println("Total Fuel Price = RM" + price);

		 }
		 
		
	}