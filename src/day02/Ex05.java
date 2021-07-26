package day02;

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		int i=100;
		i=200;
		String Korea="대한민국";
		Korea= "미국";
		System.out.println(Korea);
		
		System.out.println(i);
		
		int val; 
		System.out.println("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : "+val);
		System.in.read();
		System.in.read();
		
		System.out.println("두번째 입력 : ");
		char ch = (char)System.in.read();
		System.out.println("입력 data : "+ (char)val);
		
		Scanner input =new Scanner(System.in);
		int age; 
		String name;
		System.out.println("이름 입력 : ");
		name =input.next();
		System.out.println("나이 입력");
		age =input.nextInt();
		System.out.println("이름 : "+name+"\n 나이 :" +age);
	}
}
