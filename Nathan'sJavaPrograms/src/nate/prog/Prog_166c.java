package nate.prog;

public class Prog_166c {
	public static void main(String[] args) {

		for (int star = 1; star < 20; star++) {
			if (star % 2 == 0) {

			} else {
				System.out.print("  " + (star) + "  ");
				for (int run = 0; run < star; run++) {
					System.out.print("*");

				}
			}
		}

	}

}
