package q9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < num.length; i++) {
			System.out.printf("%d ", num[i]);
		}
	}
}