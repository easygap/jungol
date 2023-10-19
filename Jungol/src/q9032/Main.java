package q9032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. ");
		
		int num = sc.nextInt();
		sc.close();
		
		if(num >= 80) {
			System.out.print("축하합니다. 합격입니다.");
		} else {
			System.out.print("죄송합니다. 불합격입니다.");
		}
		
	}
}