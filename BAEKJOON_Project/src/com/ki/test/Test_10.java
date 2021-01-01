package com.ki.test;

import java.util.Scanner;

public class Test_10 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("첫번째 문자 출력 : ");
	int a=sc.nextInt();
	System.out.println("두번째 문자 출력 : ");
	int b =sc.nextInt();
	System.out.println("세번째 문자 출력 :");
	int c= sc.nextInt();
	
	System.out.println((a+b)%c);
	System.out.println((a%c)+(b%c)%c);
	System.out.println((a*b)%c);
	System.out.println((a%c)*(b%c)%c);
	}

}
