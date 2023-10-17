package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			int num = sc.nextInt();
			if(num > 100 || num < 0) {
				sc.close();
				break;
			} else {
				sum += num;
				count++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (float)sum/count);
	}
}