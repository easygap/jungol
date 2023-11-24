package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		
		sc.close();
		
		Name nm = new Name();
		School sch = new School();
		Grade gd = new Grade();
		
		nm.getName(name);
		sch.getSchool(school);
		gd.getGrade(grade);
		
		System.out.print("출력 : ");
		nm.setName();
		sch.setSchool();
		gd.setGrade();
	}
}
