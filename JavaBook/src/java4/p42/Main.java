package java4.p42;

public class Main {

	public static void main(String[] args) {
		String text = "홍박사&옥지얌,빵빵아,나선욱-SimonDominic";
		
		String[] names = text.split("&|,|-");
		for(String name : names) {
			System.out.println(name);
		}
	}
}