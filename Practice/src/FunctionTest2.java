import java.util.*;
public class FunctionTest2 {

//	public static void main(String[] args) {
//		System.out.println(add(2,3));
//		System.out.println(isAdult(20));
//	}
//	
//	// 1. 더하기 기능 (입력:정수2개, 출력:합)
//	public static int add(int a, int b) {
//		return a + b;
//	}
//
//	// 2. 성인 여부 (입력:나이, 출력:참/거짓)
//	public static boolean isAdult(int age) {
//		return age >= 18;
//	}
//
//	// 3. 메시지 출력 (입력:문자열, 출력:없음)
//	public static void printMsg(String msg) {
//		System.out.println(msg);
//	}
	

	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("숫자: ");		
//			int a = sc.nextInt(); // 5 입력
//			System.out.println(a);
//			
//			System.out.print("숫자: ");
//			int b = sc.nextInt();
//			System.out.println(b);
//			
//			System.out.print("숫자 : ");
//			int c = sc.nextInt();
//			System.out.println(c);
//			
//			System.out.println();
//			
//			System.out.println("합계 : " + (a + b + c));
//			System.out.printf("평균 : %.2f\n", (double)(a + b + c) / 3);
//			sc.close();
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("첫 번째 숫자: ");
	    int a = sc.nextInt();

	    System.out.print("두 번째 숫자: ");
	    int b = sc.nextInt();

	    System.out.println("덧셈: " + calculate(a, b,'+'));
	    System.out.println("뺄셈: " + calculate(a, b,'-'));
	    System.out.println("곱셈: " + calculate(a, b,'*'));
	    System.out.println("나눗셈: " + calculate(a, b,'/'));
	    sc.close();
	}
	
	public static double calculate(int a, int b, char op) {
	    switch(op) {
	        case '+': return a + b;
	        case '-': return a - b;
	        case '*': return a * b;
	        case '/': return (double)a / b;
	        default: 
	            System.out.println("잘못된 연산자");
	            return 0;
	    }
	
	
		}
		
	}
