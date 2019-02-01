import java.util.Scanner;


public class problem_2_ADDREV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a;
		int b;
		int reva;
		int revb;
		int sum;
		int revsum;
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			reva = 0;
			revb = 0;
			while (a != 0) {
				reva = reva * 10 + a % 10;
				a = a / 10;
			}
			while (b != 0) {
				revb = revb * 10 + b % 10;
				b = b / 10;
			}
			sum = reva + revb;
			revsum = 0;
			while (sum != 0) {
				revsum = revsum * 10 + sum % 10;
				sum = sum / 10;
			}
			System.out.println(revsum);
		}

		in.close();
	}

}
