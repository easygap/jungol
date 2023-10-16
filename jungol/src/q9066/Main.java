package q9066;

public class Main {

	public static void main(String[] args) {

		char[] num = new char[26];
		
		for (int i = 0, a = 'Z'; i < num.length; i++);
		{
			num[i] = (char) a--;
			System.out.printf("%c ", num[i]);
		}
	}
}