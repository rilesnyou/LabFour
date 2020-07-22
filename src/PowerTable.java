import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner scnr = new Scanner(System.in)) {
			String reply;
			
			do {
			System.out.println("Please enter a number:");
			int num = scnr.nextInt();
			final int NMAX = 3;
			final double XMAX = num;



				for (int n = 3; n <= NMAX; n++) {
					System.out.printf("%10s %10s %10s\n", "Number ", "Squared ", "Cubed ");
				}
				System.out.println();

				for (double x = 1; x <= XMAX; x++) {
					for (int n = 1; n <= NMAX; n++) {
						System.out.printf("%10.0f", Math.pow(x, n));
					}
					System.out.println();
				}

				System.out.println("Do you want to know more?: (y/n)");

				reply = scnr.next();
			} 
			while (reply.equals("y"));

		}
		System.out.println("Good bye");

	}
}
