package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner it =new Scanner(System.in);
		String name;
		int kor, mat,eng;
		System.out.print("����� �̸��� �����Դϱ�? ");
		name =it.next();
		System.out.println(name+ "���� ����������?");
		kor =it.nextInt();
		System.out.println(name+ "���� ����������?");
		eng =it.nextInt();
		System.out.println(name+ "���� ����������?");
		mat =it.nextInt();
		System.out.println("========================");
		System.out.println("�� �� :  "+name);
		System.out.println("========================");
		System.out.println("�� �� :  "+kor);
		System.out.println("�� �� :  "+eng);
		System.out.println("�� �� :  "+mat);
		System.out.println("========================");
		System.out.println("�� �� :  "+(kor+eng+mat));
		System.out.println("========================");
		
	}
}
