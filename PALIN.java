import java.util.Scanner;

public class PALIN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String str = in.next();
			char ch[] = new char[str.length()];
			if (str.length() % 2 == 0) {
				String half = str.substring(str.length() / 2);
				System.out.println(half);
				int k;
				for (k = 0; k < half.length(); k++) {
					ch[k] = half.charAt(k);
				}
				for (int j = half.length() - 1; j >= 0; j++, k++) {
					ch[k] = ch[j];
				}
				if (Integer.parseInt(str) < Integer.parseInt(half))
					System.out.println(half);
				else {
					ch[half.length() - 1] = ch[half.length() - 1];

				}
			} else {

			}

		}
	}

}
