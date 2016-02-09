package laptopprojects;

import java.util.Scanner;

public class Prog_162i {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Initial investment: ");
		int initial = sc.nextInt(); // The Initial Investment Sum
		double calc = initial;
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Enter Rate for you year " + i);
			double r = sc.nextDouble();
			r = r / 100;
			double calc2 = calc*Math.pow((1 + (r / 12)), 12);
			System.out.println(calc +"  " +calc2 );
			System.out.println(String.format("You earned $%.2f in interest", calc2-calc));
			calc = calc2;
		}

	}
}