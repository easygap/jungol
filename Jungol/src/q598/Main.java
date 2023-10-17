package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char mes = sc.next().charAt(0);
			
			/*
			
			if(Character.isAlphabetic(mes)) { 		// mes가 알파벳이면 True, 아니면 False
				System.out.println(mes);
			} else if(Character.isDigit(mes)) { 	// mes가 숫자면 True, 아니면 False
				System.out.printf("%d\n", (int)mes);
			} else {
				break;
			}
			
			*/

			if (mes >= '0' && mes <= '9') {
				System.out.printf("%d\n", (int) mes);
			}

			else if (mes >= 'A' && mes <= 'Z') {
				System.out.printf("%c\n", mes);
			}

			else if (mes >= 'a' && mes <= 'z') {
				System.out.printf("%c\n", mes);
			}

			else {
				break;
			}
		}
		sc.close();
	}
}