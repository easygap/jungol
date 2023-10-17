package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		Center cnt1 = new Center();
		
		sc.close();
		
		cnt1.Gravity(x1,y1, x2, y2, x3, y3);
	}
}

class Center{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private float sumx;
	private float sumy;
	public Center() {

	}
	
	public void Gravity(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		result();
	}
	
	public void result() {
		this.sumx = (((float)x1+x2+x3)/3);
		this.sumy = (((float)y1+y2+y3)/3);
		System.out.printf("(%.1f, %.1f)", sumx, sumy);
	}
}