package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		float avr = 0.000f;
		
		int count = 1;

		while (true) {
			int num = sc.nextInt();
			sum = sum + num;
			avr = (float)sum / count;
			if (num < 100) {
					count++;
			} else{
				break;
			}

		}
		sc.close();

		System.out.println(sum);
		System.out.printf("%.1f",avr);
	}
}