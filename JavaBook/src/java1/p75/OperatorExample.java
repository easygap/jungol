package java1.p75;
public class OperatorExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		char c3 = (char) (c2 + 1);	// 산출 타입 : int
	//	char c3 = (c2 + 1);			// 컴파일 에러
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		System.out.printf("c2 : %d\n", (int)c2);
		System.out.printf("c2 : %c\n", c2);
	}
}