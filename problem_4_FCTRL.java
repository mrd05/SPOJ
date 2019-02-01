import java.util.Scanner;

public class problem_4_FCTRL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			Integer a = in.nextInt();
			Integer count = 0;
			for (Integer x = 5; a / x >= 1; x = x * 5)
				count = count + a / x;
			System.out.println(count);
		}

	}

}
