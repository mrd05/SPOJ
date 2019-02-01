import java.util.Scanner;

public class problem_8_SAMER08F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 0) {
			Integer sum = 0;
			for (int i = 1; i <= n; i++)
				sum = sum + i * i;
			System.out.println(sum);
			n = in.nextInt();
		}
		in.close();
	}

}
