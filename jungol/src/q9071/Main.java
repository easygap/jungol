package q9071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); 
		}		
		
		sc.close();
		
		int max = -10000, min = 10000;
		
		for(int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				if(max < num[i]) {
					max = num[i];
				}
			}else {	// 홀수
				if(min > num[i])
					min = num[i];
			}
		}	
		System.out.print(min + " " + max);
	}
}