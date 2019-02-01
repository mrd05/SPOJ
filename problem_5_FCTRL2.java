import java.math.BigInteger;
import java.util.Scanner;

public class problem_5_FCTRL2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			BigInteger a = in.nextBigInteger();
			BigInteger fact = new BigInteger("1");
			while (a.intValue() > 1) {
				fact = fact.multiply(a);
				a = a.subtract(new BigInteger("1"));
			}
			System.out.println(fact);
		}
	}

}
