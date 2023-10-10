package q195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String tel = sc.next();
		String post = sc.next();
		
		sc.close();
		
		Interface myN = new Interface(name, tel, post);
		myN.print();
	}

}

class Interface{
	String name;
	String tel;
	String post;
	
	public Interface(String name, String tel, String post) {
		this.name = name;
		this.tel = tel;
		this.post = post;
	}
	
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + post);
	}
}