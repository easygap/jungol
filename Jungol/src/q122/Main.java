package q122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
			System.out.print("leap year");
		else
			System.out.print("common year");
	}
}