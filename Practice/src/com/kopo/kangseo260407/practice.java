package com.kopo.kangseo260407;

public class practice {
	public static void main(String[] args) {

		System.out.println(myFunc(1));
	}

	public static int myFunc(int i) {
		if (i == 5)
			return 5;
		return i * myFunc(i + 1);
	}
}
