package q9027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1 = sc.nextFloat(); // float 변수 num1 선언
		float num2 = sc.nextFloat(); // float 변수 num2 선언
		
		int sum = (int)(num1 + num2); // float를 int로 타입 캐스팅
		int prt = (int)num1 + (int)num2; // 각각 int로 타입 캐스팅 후 계싼
		
		System.out.printf("%d ", sum);
		System.out.printf("%d", prt);
	}
}