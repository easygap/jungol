package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String school = sc.next();
		int grade = sc.nextInt();
		
		sc.close();
		
		Student Interface1 = new Student();
		Student Interface2 = new Student(school, grade);
		
		Interface1.print();
		Interface2.print(school, grade);
	}

}

class Student {
	private String school = "Jejuelementary";
	private int grade = 6;
	
	public Student() {

	}
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}	
	
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
	
	public void print(String school, int grade) {
		System.out.println(grade + " grade in " + school + " School");
	}
	
}