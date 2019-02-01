import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problem_11_FASHION {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k;
		List<Integer> men;
		List<Integer> wom;
		BigInteger sum;
		for (int i = 0; i < n; i++) {
			k = in.nextInt();
			men = new ArrayList<>();
			wom = new ArrayList<>();
			for (int j = 0; j < k; j++)
				men.add(in.nextInt());
			for (int j = 0; j < k; j++)
				wom.add(in.nextInt());
			sum = new BigInteger("0");
			Collections.sort(men);
			Collections.sort(wom);
			for (int j = 0; j < k; j++) {
				sum = sum.add(new BigInteger("" + (men.get(j) * wom.get(j))));
			}
			System.out.println(sum);
		}
		in.close();
	}

}
