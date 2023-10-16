package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		char message = sc.next().charAt(0);
		
		sc.close();
		
		System.out.printf("%.2f\n", num1);
		System.out.printf("%.2f\n", num2);
		System.out.print(message);
	}
}