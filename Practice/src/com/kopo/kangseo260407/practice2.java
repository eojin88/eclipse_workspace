package com.kopo.kangseo260407;

public class practice2 {
		    public static int factorial(int n) {
		        if (n == 1) return 1;   // 종료 조건
		        return n * factorial(n - 1);  // 재귀 호출
		    }

		    public static void main(String[] args) {
		        int result = factorial(5);
		        System.out.println(result);
		    }
		
	}


