import java.math.BigInteger;
import java.util.Scanner;

public class problem_14_AE00 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		BigInteger bi = new BigInteger("" + n);

		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = i * i; j <= n; j = j + i) {
				bi = bi.add(new BigInteger("1"));
			}
		}
		System.out.println(bi);

		in.close();
	}

}
