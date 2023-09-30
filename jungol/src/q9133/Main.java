package q9133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nameL = sc.next();
		int korL = sc.nextInt();
		int engL = sc.nextInt();
		String nameJ = sc.next();
		int korJ = sc.nextInt();
		int engJ = sc.nextInt();
		
		sc.close();
		
		Sum sm = new Sum();
		Sum smL = new Sum(nameL, korL, engL);
		Sum smJ = new Sum(nameJ, korJ, engJ);
		
		smL.print(nameL, korL, engL);
		smJ.print(nameJ, korJ, engJ);
		
		sm.sumPrint(korL, korJ, engL, engJ);
	}
}

class Sum{
	private String name;
	private int kor;
	private int eng;
	
	public Sum() {
		
	}
	
	public Sum(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void print(String name, int kor, int eng) {
		System.out.println(name + " " + kor + " " + eng);
	}
	
	public void sumPrint(int korL, int korJ, int engL, int engJ) {
		int sumKr = korL + korJ;
		int sumEn = engL + engJ;
		System.out.printf("합계 %d %d", sumKr, sumEn);
	}
}