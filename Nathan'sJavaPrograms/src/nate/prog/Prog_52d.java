package nate.prog;
import java.util.Scanner;
public class Prog_52d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Player's Name:   ");
		String name = sc.nextLine();
		System.out.println("Enter Number of Times at bat:   ");
		int atBat = sc.nextInt();
		System.out.println("Enter Number of Hits:    ");
		int hit = sc.nextInt();
		System.out.println("Enter Number of Walks:   ");
		int walk = sc.nextInt();
		
		
		
		double BatAverage = ((hit)/(atBat - walk));
		double OnBase = ((hit + walk)/atBat);
		System.out.println("Player " +name +" has a batting average of: " +BatAverage +" and an On Base Precentage of: " +OnBase +"%" );
		
	}

}
