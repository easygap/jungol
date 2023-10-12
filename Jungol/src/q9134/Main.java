package q9134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점의 좌표는?(x, y) ");
		int corX1 = sc.nextInt();
		int corY1 = sc.nextInt();
		
		System.out.printf("점의 좌표는?(x, y) ");
		int corX2 = sc.nextInt();
		int corY2 = sc.nextInt();
		
		Coordinate cor = new Coordinate();

		cor.location(corX1, corY1, corX2, corY2);
		
		
	}
}

class Coordinate{
	private int corx;
	private int corY;
	
	public Coordinate() {
		this.corx=corx;
		this.corY=corY;
	}
	
	public Coordinate(int corX, int corY) {
		
	}
	
	public void location(int corX1, int corY1, int corX2, int corY2) {
		float locX = (float)(corX1 + corX2) / 2 ;
		float locY = (float)(corY1 + corY2) / 2;
		
		System.out.printf("중심점의 위치 = (%.1f, %.1f)", locX, locY);
	}
	
	
}