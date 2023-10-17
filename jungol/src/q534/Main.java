package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ar = sc.next().charAt(0);
		sc.close();
		/*
		switch(ar) {
		case 'A' :
			System.out.println("Excellent");
			break;
			
		case 'B' :
			System.out.println("Good");
			break;
			
		case 'C' :
			System.out.println("Usually");
			break;
			
		case 'D' :
			System.out.println("Effort");
			break;
			
		case 'F' :
			System.out.println("Failure");
			break;
			
		default :
			System.out.println("error");
			break;
		}
		*/
		
		if(ar == 'A') {
			System.out.println("Excellent");
		} else if(ar == 'B') {
			System.out.println("Good");
		} else if(ar == 'C') {
			System.out.println("Usually");
		} else if(ar == 'D') {
			System.out.println("Effort");
		} else if(ar == 'F') {
			System.out.println("Failure");	
		} else {
			System.out.println("error");
		}
	}
}
