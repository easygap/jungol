package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		Rectangle rt = new Rectangle();

		rt.setRectangle(n, m);

		rt.makeRectangle();
	}
}

class Rectangle {
	private int n;
	private int m;

	private int count = 1;

	public void Rectangle() {
	}

	public void setRectangle(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public void makeRectangle() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) {
					if( j == m - 1)
						System.out.print(count + " ");
					else
						System.out.print(count++ + " ");
				} else {
					if(j == 0) {
						count = count + m;
						System.out.print(count-- + " " );
					}
					else if ( j == m - 1 ){
						System.out.print(count + " " );
						count = count + m;
					} else {
						System.out.print(count-- + " " );
					}
				}
			}
			System.out.println();
		}
	}
}