package java4.p64;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int[] gamer = new int[3];
		
		int strike = 0;
		int ball = 0;
		
		boolean end = true;
		
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());
		
		for(int i = 0; i < num.length; i++) {
			num[i] = rn.nextInt(9);
			if(i == 1 && num[i] == num[i-1]) {
				i--;
			} else if(i == 2 && (num[i] == num[i-1] || num[i] == num[i-2]))
				i--;
		}
		
//		System.out.println(num[0] + 1);
		
		while(end) {
			strike = 0;
			ball = 0;
			for(int i = 0; i < gamer.length; i++) {		// 사용자에게 3개의 값을 입력 받음
				gamer[i] = sc.nextInt();
			}
			for(int i = 0; i < num.length; i++) {		// 반복문을 돌면서 0번 index 부터 입력 값과 난수를 비교
				for (int j = 1; j <= gamer.length; j++) {
					if (gamer[j] == num[i] && i == j) {
						strike++;
					} else if (gamer[j] == num[i]) {
						ball++;
					}
					if (strike == 3) {
						System.out.println("아웃!! 게임을 종료합니다.");
						sc.close();
						end = false;
					}
				}
			}
			System.out.println(strike + "strike, " + ball + "ball");
		}
	}
}