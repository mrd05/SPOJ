import java.util.Scanner;

public class problem_9_ACPC10A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		while (!(a == 0 && b == 0 && c == 0)) {
			if (b - a == c - b) {
				System.out.println("AP " + (c + c - b));
			} else {
				System.out.println("GP " + (c * (c / b)));
			}

			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		}
		in.close();
	}

}
