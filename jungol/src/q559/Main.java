package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] score = new String[] {"85.6", "79.5", "83.1", "80.0", "78.2", "75.0"};
	
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		double change1 = Double.parseDouble(score[num1 - 1]);
		double change2 = Double.parseDouble(score[num2 - 1]);
		
		System.out.printf("%.1f", change1 + change2);
	}
}