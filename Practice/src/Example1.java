import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("합계 : " + (a + b));

//		float f = 1.1333333f;
//		double d = 1.1;
//		double e = 2.1;
//		
//		System.out.printf("float: %5.2f\n", f);
//		System.out.printf("double: %.20f\n", d);
//		System.out.println(d + e);
//		

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫 번째 숫자 : ");
//		int a = sc.nextInt();
//		
//		System.out.println("두 번째 숫자 : ");
//		int b = sc.nextInt();
//			
//		System.out.println("덧셈 결과 : " + (a + b));
//		System.out.println("뺄셈 결과 : " + (a - b));
//		System.out.println("곱셈 결과 : " + (a * b));
//		System.out.println("나눗셈 결과 : " + (a / b));
//		System.out.println("나눗셈 결과 : " + ((double)a / b));

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 점수 : "); 
//		int a = sc.nextInt();
//		
//		System.out.print("영어 점수 : ");
//		int b = sc.nextInt();
//		
//		System.out.print("수학 점수 : ");
//		int c = sc.nextInt();
//		
//		System.out.println();
//		
//		System.out.println("총점 : " + (a + b + c));
//		System.out.printf("평균 : %.2f\n", (double)(a + b + c) / 3);

//		float r = 3.0f;
//		
//		double area = Math.PI * r * r;
//		System.out.println(area);
//		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("반지름의 길이를 입력하세요. :");
//		
//		double a = sc.nextDouble();
//		
//		
//		System.out.println("원의 넓이는 " + a * a * Math.PI);

//		System.out.println(3 == 5);

//		int dice = 4;
//		switch (dice) {
//		case 1:
//			System.out.println("멍멍");
//			break; // 필수!
//		case 2:
//			System.out.println("야옹");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		default:
//			System.out.println("기타");
//		}

//		int dice = 4;
//		if (dice == 1) {
//			System.out.println("멍멍"); }
//		else if (dice == 2) {
//			System.out.println("야옹"); }
//		else {
//			System.out.println("기타"); 
//		}

//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

//		for (int a = 2; a <= 9; a++) {
//			System.out.println();
//			System.out.println("----" + a + "단" + "----");
//			
//			
//			for (int b = 1; b <= 9; b++) {
//				System.out.println(a + "*" + b + "=" + (a * b));
//				
//			}
//		}

//		int a = 0;
//		int b = 0;
//
//		while (a <= 100) {
//			b += a;
//			a++;
//		}
//		System.out.println(b);

		
		
//		//generated method stub
//		// 1. 선언 + 생성 (공간만 확보)
//		// int형 공간 5개 (0으로 자동 초기화)
//		int[] arr1 = new int[5];
//		// 2. 선언 + 초기화 (값 지정)
//		int[] arr2 = {10, 20, 30, 40, 50};
//		// 3. 값 접근 및 변경
//		System.out.println(arr2[0]); // 10
//		arr2[0] = 100;
//		System.out.println(arr2[0]); // 100
//		// 4. 배열 길이 (length)
//		// 인덱스 범위: 0 ~ (length - 1)
//		System.out.println(arr2.length); // 5
//		// 주의: 인덱스 범위 초과시 예외 발생!
//		// arr2[5] -> ArrayIndexOutOfBoundsException
		
		
		
//		int[] a = {30, 25, 10, 100, 10, 20, 30, 400, 50};
//		int temp = 0;
//		for(int i = 0; i < a.length; i++) {
//			for(int j = i + 1; j < a.length; j++) {
//				if(a[i] < a[j])	{
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//				
//			}
//		}
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
		 //선택정렬
		int[] a = {100, 20, 30, 50, 60, 90, 80, 70, 40, 10, 1};
		int temp;
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		
		
		//버블정렬
		int[] a = {100, 20, 30, 50, 60, 90, 80, 70, 40, 10, 1};
		int temp;
		
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 1; j < a.length; j++) {
				if(a[j] > a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		
//		// 선택정렬
//        int[] a = {100, 20, 30, 50, 60, 90, 80, 70, 40, 10, 1};
//        int temp = 0;
//
//        for(int i = 0; i < a.length - 1; i++) {
//            int maxIndex = i;  // 가장 큰 값의 위치
//
//            for(int j = i + 1; j < a.length; j++) {
//                if(a[j] < a[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//
//            // i 위치와 maxIndex 위치 교환
//            temp = a[i];
//            a[i] = a[maxIndex];
//            a[maxIndex] = temp;
//        }
//
//        // 출력
//        for(int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
		
		
		
		
		
		
		
		
	}

}
