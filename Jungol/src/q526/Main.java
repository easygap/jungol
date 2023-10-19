package q526;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		
		System.out.printf("%d %d", (int)(num1*num2), (int)num1*(int)num2);
	}
}