package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("yard? ");
		
		double cm = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("%.1fyard = %.1fcm", cm, cm * 91.44 );
	}
}