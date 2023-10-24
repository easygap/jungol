package q121;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		if(num == 0) {
			System.out.print("zero");
		} else if (num > 0) {
			System.out.print("plus");
		} else {
			System.out.print("minus");
		}
	}
}