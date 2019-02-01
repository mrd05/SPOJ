import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class problem_3_PRIME1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Integer n = in.nextInt();
		Integer a;
		Integer b;
		List<Integer> list = new CopyOnWriteArrayList<>();
		for (Integer i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();

			for (Integer j = 2; j <= b; j++)
				list.add(j);
			for (Integer x : list) {
				if (x > Math.sqrt(b))
					break;
				for (Integer y = x * 2; y <= b; y = y + x)
					list.remove(y);
			}
			for (Integer j : list) {
				if (j >= a && j <= b)
					System.out.println(j);
			}
			System.out.println();

		}
		in.close();
	}
}
