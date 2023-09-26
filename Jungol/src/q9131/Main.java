package q9131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("친한 친구의 이름과 나이를 입력하세요. ");

		String name = sc.next();
		int age = sc.nextInt();

		sc.close();

		IsName friend1 = new IsName();
		IsName friend2 = new IsName(name, age);
		friend1.print();
		friend2.Isname();

	}
}

class IsName {
	private String name = "손예준";
	private int age = 12;

	public IsName() {

	}

	public IsName(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("당신의 이름 : " + name + ", " + "나이 : " + age);
	}
	
	public void Isname() {
		System.out.println("친구의 이름 : " + name + ", " + "나이 : " + age);
	}
}