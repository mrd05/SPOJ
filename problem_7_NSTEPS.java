import java.util.Scanner;

public class problem_7_NSTEPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x == y || x == y + 2) {
				if (y % 2 == 0)
					System.out.println(x + y);
				else
					System.out.println(x + y - 1);
			} else
				System.out.println("No Number");
		}
	}

}
