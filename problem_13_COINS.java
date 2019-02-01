import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_13_COINS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		map.put(new BigInteger("0"), new BigInteger("0"));
		map.put(new BigInteger("1"), new BigInteger("1"));
		map.put(new BigInteger("2"), new BigInteger("2"));
		map.put(new BigInteger("3"), new BigInteger("3"));
		while (in.hasNext()) {
			BigInteger b = in.nextBigInteger();

			BigInteger sum = find(b);
			System.out.println(sum);
		}
		in.close();
	}

	public static Map<BigInteger, BigInteger> map = new HashMap<>();

	public static BigInteger find(BigInteger b) {

		if (b.equals(BigInteger.ZERO))
			return new BigInteger("0");
		if (map.containsKey(b))
			return map.get(b);
		BigInteger n1 = b.divide(new BigInteger("2"));
		BigInteger n2 = b.divide(new BigInteger("3"));
		BigInteger n3 = b.divide(new BigInteger("4"));
		n1 = find(n1);
		n2 = find(n2);
		n3 = find(n3);
		BigInteger sum = n1.add(n2);
		sum = sum.add(n3);
		sum = sum.max(b);
		map.put(sum, sum);
		return sum;

	}

}
