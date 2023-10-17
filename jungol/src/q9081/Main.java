package q9081;

public class Main {

	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.line();
		System.out.println("line 함수를 호출하였습니다.");
		System.out.println("line 함수를 다시 호출합니다.");
		bar.line();
	}

}

class Bar{
	public void Bar() {
		
	}
	
	public void line() {
		for(int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
}