package com.kopo.kangseo260407;


class A {
	void doA() {
		System.out.println("A");
	}
}

class B extends A {
	@Override
	void doA() {
		System.out.println("B");
	}
}

class C extends B {
// doA()를 오버라이드하지 않음
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new C(); // 동적 바인딩
		obj.doA(); // 무엇이 출력될까요?
	}

}