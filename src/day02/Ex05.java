package day02;

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		int i=100;
		i=200;
		String Korea="���ѹα�";
		Korea= "�̱�";
		System.out.println(Korea);
		
		System.out.println(i);
		
		int val; 
		System.out.println("�Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : "+val);
		System.in.read();
		System.in.read();
		
		System.out.println("�ι�° �Է� : ");
		char ch = (char)System.in.read();
		System.out.println("�Է� data : "+ (char)val);
		
		Scanner input =new Scanner(System.in);
		int age; 
		String name;
		System.out.println("�̸� �Է� : ");
		name =input.next();
		System.out.println("���� �Է�");
		age =input.nextInt();
		System.out.println("�̸� : "+name+"\n ���� :" +age);
	}
}
