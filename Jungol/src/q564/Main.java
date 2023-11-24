package q564;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = new char[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		while (true) {
			char mes = sc.next().charAt(0);

			if (mes < 'A' || mes > 'Z') {
				sc.close();
				break;
			}

			arr[(int) mes - 65]++;

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println( (char)(int)(i + 65) + " : " + (int)arr[i]);
			}
		}

	}
}