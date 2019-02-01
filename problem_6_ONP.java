import java.util.Scanner;
import java.util.Stack;

public class problem_6_ONP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			String str = in.nextLine();
			Stack<Character> st = new Stack<>();
			String last = "";
			Character ch;
			Character t;
			for (int j = 0; j < str.length(); j++) {
				ch = str.charAt(j);
				if (ch.equals(' '))
					continue;
				if (Character.isLetter(ch)) {
					last = last + ch;
				} else {
					if (st.isEmpty())
						st.push(ch);
					else {
						if (ch.equals('('))
							st.push(ch);
						else if (ch.equals(')')) {
							t = st.pop();
							while (!t.equals('(')) {
								last = last + t;
								t = st.pop();
							}
						} else {
							int wc = getWeight(ch);
							int ws = getWeight(st.peek());
							if (wc > ws)
								st.push(ch);
							else {
								while (wc < ws) {
									t = st.pop();
									last = last + t;
									ws = getWeight(st.peek());
								}
								st.push(ch);
							}
						}
					}
				}
			}
			System.out.println(last);
		}
	}

	public static int getWeight(char ch) {
		switch (ch) {
		case '+':
			return 1;
		case '-':
			return 2;
		case '*':
			return 3;
		case '/':
			return 4;
		case '^':
			return 5;

		default:
			return 0;
		}
	}

}
