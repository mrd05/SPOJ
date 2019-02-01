import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class STPAR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list;
		Stack<Integer> st;
		while (n != 0) {
			list = new ArrayList<>();
			st = new Stack<>();
			for (int i = 0; i < n; i++) {
				list.add(in.nextInt());
			}
			int i, j;
			for (i = 0, j = 1; i < n; i++) {
				while (!st.empty() && st.peek() == j) {
					st.pop();
					j++;
				}
				if (list.get(i) == j) {
					j++;
					continue;
				} else {
					if (st.empty())
						st.push(list.get(i));
					else {
						if (st.peek() < list.get(i))
							break;
						else
							st.push(list.get(i));
					}
				}
			}
			if (i == n)
				System.out.println("yes");
			else
				System.out.println("no");
			n = in.nextInt();
		}
		in.close();
	}

}
