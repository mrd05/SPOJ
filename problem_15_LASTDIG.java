import java.math.BigInteger;
import java.util.Scanner;

public class problem_15_LASTDIG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			BigInteger b = in.nextBigInteger();
			a = a % 10;
			if (!(a == 0 || a == 1 || a == 5 || a == 6)) {
				b = b.mod(new BigInteger("4"));
				if (b.intValue() == 2)
					a = (a * a) % 10;
				else if (b.intValue() == 3)
					a = (((a * a) % 10) * a) % 10;
				else if (b.intValue() == 0)
					a = (((((a * a) % 10) * a) % 10) * a) % 10;
			}
			System.out.println(a);
		}
		in.close();
	}
}
