package nate.prog;
import java.util.Scanner;
public class Prog_58h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Compute Interest");
		System.out.println("P = Amount originally saved, r = rate of interest (in percent), n = number of days compounded per year, t= number of days kept in account" );
		System.out.print("Enter in order:  ");
		
		int P = sc.nextInt();
		double r = sc.nextDouble();
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		
		double equation = P*Math.pow( (1+((0.1*r)/n)) , ((n*t)/365));
		double gainInterest = equation - P;
		
		System.out.println("Amount Saved: " +P);
		System.out.println("Interest Rate: " +r);
		System.out.println("Number of times compinded per year?: " +n);
		System.out.println("Number of Days at interest?: " +t);
		
		System.out.println("The interest earned is: $" +String.format("%.2f", gainInterest) );
		System.out.println("The total amount in saving now: $" +String.format("%.2f", equation));
		

	}

}
