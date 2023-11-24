package q9074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		while(true) {
			int num = sc.nextInt();
			
			if(num < 1 || num > 10) {
				sc.close();
				break;
			}
			
			arr[num-1]++;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(i+1 + " : " + arr[i] + "개");
			}
		}
	}
}