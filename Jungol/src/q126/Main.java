package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int even = 0;		// 짝수 count
		int odd = 0;		// 홀수 count
		
		while(true) {
			int num = sc.nextInt();
			if(num % 2 == 0 && num != 0) {
				even++;
			}
			if(num % 2 != 0 && num != 0) {
				odd++;
			}
			if(num == 0) {
				sc.close();
				System.out.println("odd : " + odd);
				System.out.println("even : " + even);
				break;
			}
		}
	}
}