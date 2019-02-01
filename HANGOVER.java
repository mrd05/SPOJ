import java.util.Scanner;

public class HANGOVER {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float len = Float.parseFloat(in.next());
		float sum;
		float i;
		while (len != 0) {
			sum = 0;
			i = 2;
			while (sum < len) {
				sum = sum + 1 / i;
				i++;
			}
			System.out.println((int) i - 2 + " card(s)");
			len = in.nextFloat();
		}
		in.close();
	}

}
