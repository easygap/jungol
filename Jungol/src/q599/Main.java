package q599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String olympic = str.replaceAll("[^A-z]", "");

		olympic = olympic.toUpperCase();

		System.out.println(olympic);
	}
}