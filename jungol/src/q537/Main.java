package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		int a = 1;
		int sum = 0;

		if (num <= 100) {
			while (a <= num) {
				sum = sum + a;
				a++;
			}

			System.out.println(sum);
		}
	}
}