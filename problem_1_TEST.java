import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problem_1_TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		try {
			str = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (Integer.parseInt(str) != 42)
		{
			System.out.println(str);
			try {
				str=reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
