package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int left = sc.nextInt();
			int right = sc.nextInt();

			if (left >= 2 && left <= 9 && right >= 2 && right <= 9) {
				if (left <= right) {
					for (int i = 1; i <= 9; i++) {
						for (int j = left; j <= right; j++) {
							System.out.printf("%d * %d = %2d   ", j, i, i * j);
						}
						System.out.println();
					}
				} else {
					for (int i = 1; i <= 9; i++) {
						for (int j = left; j >= right; j--) {
							System.out.printf("%d * %d = %2d   ", j, i, i * j);
						}
						System.out.println();
					}
				}
				sc.close();
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}
		}
	}
}