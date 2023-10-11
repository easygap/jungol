package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float avr = 0;
		Scanner sc = new Scanner(System.in);

		avr = sc.nextFloat();

		switch ((int) avr) {
		case 0:
		case 1:
			System.out.println("retake");
			break;

		case 2:
			System.out.println("seasonal semester");
			break;

		case 3:
			System.out.println("next semester");
			break;

		case 4:
			System.out.println("scholarship");
			break;

		default:
			break;
		}

		sc.close();
	}

}