import java.util.Scanner;

public class problem_10_CANDY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int arr[];
		int sum;
		int x;
		while (n != -1) {
			arr = new int[n];
			sum = 0;
			for (int i = 0; i < n; i++) {
				x = in.nextInt();
				arr[i] = x;
				sum = sum + x;
			}
			if (sum % n != 0)
				System.out.println(-1);
			else {
				x = sum / n;
				sum = 0;
				for (int i = 0; i < n; i++) {
					if (arr[i] < x) {
						sum = sum + x - arr[i];
					}
				}
				System.out.println(sum);
			}
			n = in.nextInt();
		}
		in.close();
	}

}
