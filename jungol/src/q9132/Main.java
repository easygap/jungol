package q9132;

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
		
		Average avgL = new Average(nameL, korL, engL);
		Average avgJ = new Average(nameJ, korJ, engJ);
		
		avgL.getAvg(nameL, korL, engL);
		avgJ.getAvg(nameJ, korJ, engJ);
		
		avgJ.sumAvg(korL, engL, korJ, engJ);
	}
}

class Average{
	private String name;
	private int kor;
	private int eng;
	
	public Average(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void getAvg(String name, int kor, int eng) {
		System.out.println(name + " " + kor + " " + eng); 
	}
	
	public void sumAvg(int korL, int engL, int korJ, int engJ) {
		int avgKor = korL + korJ;
		int avgEng = engL + engJ;
		System.out.println("합계 " + avgKor + " " + avgEng); 
	}
}