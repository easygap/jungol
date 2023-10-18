package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		Area area = new Area(num);
		area.Circle();
	}

}

class Area {
	double area;

	Area(int num) {
		this.area = Math.round((double) num * num * 3.14 * 100) /100.0;
	}

	public void Circle() {
		System.out.printf("%.2f", area);
	}
}