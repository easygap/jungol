package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0; // 짝수 count 변수 선언
		int odd = 0; // 홀수 count 변수 선언

		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			} else if (num % 2 == 0) {		// 짝수 count
				even++;
			} else {						// 홀수 count
				odd++;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}