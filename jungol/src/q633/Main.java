package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean condition = true;
		
		Scanner sc = new Scanner(System.in);
		while(condition) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");

			int capital = sc.nextInt();
			
			switch (capital) {
			case 1:
				System.out.println("Seoul");
				System.out.println();
				break;
			case 2:
				System.out.println("Washington");
				System.out.println();
				break;
			case 3:
				System.out.println("Tokyo");
				System.out.println();
				break;
			case 4:
				System.out.println("Beijing");
				System.out.println();
				break;
			default:
				sc.close();
				System.out.println("none");
				System.out.println();
				condition = false;
				break;
			}
		}
	}
}