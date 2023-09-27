package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String st = sc.next();

		int it = sc.nextInt();

		sc.close();

		String reverse = "";

		for (int j = st.length() - 1; j >= 0; j--) {
			reverse = reverse + st.charAt(j);
		}

		if (reverse.length() >= it) {
			System.out.print(reverse.substring(0, it));
		} else {
			System.out.print(reverse);
		}

	}
}