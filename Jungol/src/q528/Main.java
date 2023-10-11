package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		scanner.close();

		System.out.println(a);
		if (a<0) {
			System.out.println("minus");
		}
	}
}