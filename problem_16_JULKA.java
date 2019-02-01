import java.math.BigDecimal;
import java.util.Scanner;

public class problem_16_JULKA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		while (in.hasNextBigInteger()) {
			BigDecimal tog = in.nextBigDecimal();
			BigDecimal more = in.nextBigDecimal();
			BigDecimal half = tog.divide(new BigDecimal(2));
			BigDecimal hm = more.divide(new BigDecimal(2));
			System.out.println((half.add(hm)).toBigInteger());
			System.out.println((half.subtract(hm)).toBigInteger());
		}
	}

}
