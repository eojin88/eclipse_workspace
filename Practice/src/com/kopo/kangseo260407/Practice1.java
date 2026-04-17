package com.kopo.kangseo260407;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
//		int a[] = {1,2,3};
//		Arrays.sort(a);
		
		// 1~100 : 5050
		// int sum-0;
		//for(int i=1; i<=100; 1++) {
		//sum += i;
		//}
		// System.out.println(sum);
		
		
		// 1. 5! 구현 실습 5*4*3*2*1
		// 2. 피보나치 수열 구현 실습     재귀로
		
//	 int practice1 = 1;
//	 for(int i = 1; i <= 5; i++) {
//		 practice1 *= i;
//	 }
//		System.out.println(practice1);
		
		int practice1 = 1;
		 for(int i = 5; i >= 1; i--) {
			 practice1 *= i;
		 }
			System.out.println(practice1);
			
			
		
		
		
		System.out.println(myFunc(1));
	}
	public static int myFunc(int i) {
		if(i==100) return 100;
		return i + myFunc(++i);
	}
}
