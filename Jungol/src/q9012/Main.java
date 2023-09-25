package q9012;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		double c = 3.14;
		float d = (float) ( a * b * c);
		float e = (float) (a * a * c);
		System.out.printf("원주 = %d * %d * %.6f = %.6f\n", a, b, c, d);
		System.out.printf("넓이 = %d * %d * %.6f = %.6f", a, a, c, e);
	}
}