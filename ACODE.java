import java.util.Scanner;

public class ACODE {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.next();
		int dp[];
		char ch[];
		while (!str.equalsIgnoreCase("0")) {
			dp = new int[str.length() + 1];
			ch = str.toCharArray();
			dp[0] = 1;
			for (int i = 0; i < ch.length; i++) {
				dp[i + 1] = dp[i + 1] + dp[i];
				if (i > 0) {
					int a = Integer.parseInt(ch[i - 1] + "" + ch[i]);
					if (a > 0 && a <= 26)
						dp[i + 1] = dp[i + 1] + dp[i - 1];
				}
			}
			System.out.println(dp[str.length()]);
			str = in.next();
		}
		in.close();
	}

}
