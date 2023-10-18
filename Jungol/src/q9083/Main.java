package q9083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		sc.close();
		
		new Approx(inp);
	}
}

class Approx{
	
	public Approx(int inp) {
		System.out.println("10큰수 : " + (inp + 10));
		System.out.println("10작은수 : " + (inp - 10));
	}
}