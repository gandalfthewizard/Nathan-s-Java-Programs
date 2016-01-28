package nate.prog;

public class Prog_122h {
	public static void main(String[] args ) {
		
		System.out.println("Number    Square      Square root    Cube   4th Root");
for (int num = 1; num < 20; num++) {		
	
	System.out.println(String.format("%2d", num) +"        " +String.format("%4d", num*num) +"        "+String.format("%4f", Math.sqrt(num)) +"        " +String.format("%4d", (num*num*num))
	+"        " + String.format("%4f", Math.pow(num, 1/4)));
}
		
		
	}
	
}


