package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		--num2;
		int num3 = num1 * num2;
		num1++;
		
		
		System.out.printf("%d %d %d", num1, num2, num3);
	}
}