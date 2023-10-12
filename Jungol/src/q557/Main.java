package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] ar = new char[10];
		Scanner sc = new Scanner(System.in);
		

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();
		System.out.print(ar[0] + " " + ar[3] + " " + ar[6]);
	}
}