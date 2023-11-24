package q1840;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int colum = sc.nextInt();

		for (int i = 0; i < colum; i++) {
			System.out.println();
			for(int j = 0; j < row; j++) {
				System.out.println("*");
			}
		}
	}
}