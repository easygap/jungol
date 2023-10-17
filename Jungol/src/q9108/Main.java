package q9108;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean end = true;
		
		while(end) {
			char message = sc.next().charAt(0);
			
			System.out.printf("%c -> %d\n", message, (int)message);
			
			if(message == '0') {
				sc.close();
				end = false;
			}
		}
	}
}