package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String length1 = sc.next();
		String length2 = sc.next();
		sc.close();
		
		System.out.println(length1.length() + length2.length());
	}
}