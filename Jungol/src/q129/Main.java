package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean again = true;
		
		while(again) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			double width = (double)base * height /2;
			
			System.out.printf("Triangle width = %.1f\n", width);
			System.out.print("Continue? ");
			
			char con = sc.next().charAt(0);
			
			if(con == 'Y' || con == 'y') {
				continue;
			} else {
				sc.close();
				break;
			}
		}
	}
}