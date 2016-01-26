package nate.prog;
import java.util.Scanner;
public class Prog_93a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter KWH Used: ");
		int KWH = sc.nextInt();
		
		double KWcost = (KWH*0.0475);
		
		double SurChrg = (KWcost*0.10);
		
		double tax = (KWcost*.03);
		
		double total = (KWcost+SurChrg+tax);
		
		double late = ((total*0.04)+total);
		
		System.out.println("            CompSci Electrics            ");
		System.out.println("---------------------------------------------");
		System.out.println("Killowatts Used:    " +KWH +" @$ 0.0475");
		System.out.println("---------------------------------------------");
		System.out.println("Base Charge                       $ " +String.format("%.2f", KWcost));
		System.out.println("Surcharge                         $ " +String.format("%.2f", SurChrg));
		System.out.println("City Tax                          $ " +String.format("%.2f", tax));
		System.out.println("                                 __________");
		System.out.println("Pay This Amount                    $ "+String.format("%.2f", total));
		System.out.println("Payment if late                    $ " +String.format("%.2f", late));
		
	}
}
