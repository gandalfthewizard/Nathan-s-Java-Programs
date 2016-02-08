package laptopprojects;
import java.util.Scanner;
public class Prog_162a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean answr = true;
		while(answr){
			System.out.println("Enter a Number: ");
			int num = sc.nextInt();
			int one = 1;

			for(int x=1;x<=num; x++){
				one *= x;
			}
			System.out.println( num +"! is: " + one);
			System.out.println("Enter another number? (Yes/No)");
			answr = sc.hasNext("Yes");
			sc.next();
		}
	}



}



