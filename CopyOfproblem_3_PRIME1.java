import java.util.Scanner;

public class CopyOfproblem_3_PRIME1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Integer n = in.nextInt();
		Integer a;
		Integer b;
		int arr[];
		int prime[];
		for (Integer i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			Integer sq = (int) (Math.sqrt(b) + 1);

			arr = new int[sq];
			prime = new int[sq];

			for (int j = 0; j < sq; j++)
				arr[j] = 1;
			int j = 0;
			for (int x = 2; x < sq; x++) {
				if (arr[x] == 1) {
					prime[j] = x;
					j++;

					for (Integer y = x * 2; y < sq; y = y + x)
						arr[y] = 0;
				}
			}

			int diff = (b - a + 1);
			arr = new int[diff];
			for (int x = 0; x < diff; x++)
				arr[x] = 1;
			for (int x = 0; x < j; x++) {
				int div = a / prime[x];
				div *= prime[x];
				while (div <= b) {
					if (div >= a && prime[x] != div)
						arr[div - a] = 0;
					div += prime[x];
				}
			}
			for (int x = 0; x < diff; x++) {
				if (arr[x] == 1 && (i + a) != 1)
					System.out.println(i + a);
			}

			System.out.println();

		}
		in.close();
	}
}
