package nate.prog;
import java.util.Scanner;
public class Prog_58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quadratic Equation Solver");
		System.out.print("Enter A, B, C [All in one line] ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		double root1 = -((B + Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A);
		double root2 = -((B - Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A);
		
		System.out.println("The roots are: " + root1 +", " +root2);

	}

}
