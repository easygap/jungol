package q9130;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("당신의 이름은 무엇입니까? ");
		String name = sc.next();
		
		System.out.printf("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt();
		
		sc.close();
		
		WhatIs you = new WhatIs(name, age);
		you.print();
	}
}

class WhatIs{
	private String name;
	private int age;
	
	public WhatIs(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.print("당신의 이름은 " + name + "이고 " + "나이는 " + age + "세이군요.");
	}
	
}