package laptopprojects;
import java.util.Scanner;
public class Prog_72a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Credit Card Number (XX XX XX XX): ");
		int[] card = new int [4];
		
		for (int i = 0; i < 4; i++) {
			card[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i < 4; i++){
			sum += card[i];
		}
	
		int divide = 26;
		int value = sum%divide;
		value += 65;
		System.out.println("The correct number and code is: " +String.format("%d %d %d %d %c",card[0], card[1], card[2], card[3], value));

	}
}