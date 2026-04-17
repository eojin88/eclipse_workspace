package com.kopo.kangseo260407;

public class practice3 {
	public static void main(String[] args) {

		int[][] a = new int[5][5];

//        for(int x = 0; x < a.length; x++) {
//        	for(int y = 0; y < a.length; y++) {
//        		System.out.print("("+x+","+y+") ");
//        	}
//        	System.out.println();

		// 가로 x축
		for (int x = 2; x < 3; x++) {
			for (int y = 0; y < a.length; y++) {
				System.out.print("(" + x + "," + y + ") ");
			}

		}
		System.out.println();

		// 세로 y축
		for (int x = 0; x < a.length; x++) {
			for (int y = 2; y < 3; y++) {
				System.out.print("(" + x + "," + y + ") ");
			}
		}
	    System.out.println();
	    System.out.println();
	    // 대각선 왼쪽 위 에서 오른쪽 아래
	    for (int x = 0; x < a.length; x++) {
			System.out.print("(" + x + "," + x + ") ");
	    }	
	    System.out.println();
	    // 대각선 왼쪽 아래 에서 오른쪽 위
	    for (int x = 0; x < a.length; x++) {
				System.out.print("(" + (4 - x) + "," + x + ") ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    for (int x = 0; x < a.length; x++) {
	    	for (int y = 0; y< a.length; y++) {
	    		if (x == 2 || y == 2) {
	    			System.out.print("("+x+","+y+")");
	    		}
	    		else {
	    			System.out.print("     ");
	    		}
	    	}
	    	System.out.println();
	    }
	}
}







