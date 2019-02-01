import java.util.Scanner;

public class problem_12_TOANDFRO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int col = in.nextInt();
		int x;
		char arr[][];
		String last = "";
		while (col != 0) {
			String str = in.next();
			arr = new char[str.length() / col][col];
			x = 1;
			for (int i = 0, k = 0; i < str.length(); i = i + col, k++) {
				if (x == 1) {
					for (int j = i, l = 0; j < i + col; j++, l++) {
						arr[k][l] = str.charAt(j);
					}
				} else {
					for (int j = i + col - 1, l = 0; j >= i; j--, l++) {
						arr[k][l] = str.charAt(j);
					}
				}
				x = x * -1;
			}
			last = "";
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < str.length() / col; j++) {
					last = last + arr[j][i];
				}
			}
			System.out.println(last);
			col = in.nextInt();
		}
		in.close();
	}

}
