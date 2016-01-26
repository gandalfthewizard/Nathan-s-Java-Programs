package nate.prog;
import java.util.Scanner; 
public class Prog_76a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a Number you dislike: ");
		int nonum = sc.nextInt();
		int squared = (nonum*nonum);
		int longnum = 12345679;
		int suprise = (longnum*squared);
		int bignum = 1000;
		int lastnum = (bignum*suprise);
		
		
		
		System.out.println("               " +nonum);
		System.out.println("              X" +nonum);
		System.out.println("              __________");
		System.out.println("                      " +squared);
		System.out.println("                      X" +longnum);
		System.out.println("              __________");
		System.out.println("Suprise                 " +suprise);
		System.out.println("                        X" +bignum);
		System.out.println("              __________");
		System.out.println("No Surprise?            " +lastnum );
		
		
		
		

	}

}
