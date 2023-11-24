package q573;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		Square sq = new Square(num);
		sq.makeSquare();
	}
}

class Square {
	private int num;

	public Square(int num) {
		this.num = num;
	}

	public void makeSquare() {
		int count = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("%d ", count);
				count++;
			}
			System.out.println();
		}

	}
}