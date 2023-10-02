package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				System.out.println(num/3);
			} else if (num == -1) {
				sc.close();
				break;
			}
		}
	}
}