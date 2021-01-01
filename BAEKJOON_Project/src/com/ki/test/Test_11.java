package com.ki.test;

import java.util.Scanner;

public class Test_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 :");
		int a=sc.nextInt();
		System.out.println("두번째 :");
		int b=sc.nextInt();
		System.out.println(a*5);
		System.out.println(a*8);
		System.out.println(a*3);
		System.out.println(a*(b%10));		// 일의자리수
		System.out.println(a*(b/10%10));	//십의 자리수
		System.out.println(a*(b/100));		//백의자리수 
		System.out.println(a*b);
	}

}
