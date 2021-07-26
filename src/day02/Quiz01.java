package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner it =new Scanner(System.in);
		String name;
		int kor, mat,eng;
		System.out.print("당신의 이름은 무엇입니까? ");
		name =it.next();
		System.out.println(name+ "님의 국어점수는?");
		kor =it.nextInt();
		System.out.println(name+ "님의 영어점수는?");
		eng =it.nextInt();
		System.out.println(name+ "님의 수학점수는?");
		mat =it.nextInt();
		System.out.println("========================");
		System.out.println("이 름 :  "+name);
		System.out.println("========================");
		System.out.println("국 어 :  "+kor);
		System.out.println("영 어 :  "+eng);
		System.out.println("수 학 :  "+mat);
		System.out.println("========================");
		System.out.println("합 계 :  "+(kor+eng+mat));
		System.out.println("========================");
		
	}
}
