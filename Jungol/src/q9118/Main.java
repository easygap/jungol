package q9118;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] word = new String[5];
		
		for(int i = 0; i < 5; i++) {
			word[i] = sc.nextLine();
		}
		
		sc.close();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(word[i]);
		}
	}
}