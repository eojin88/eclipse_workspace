// "hello" 를 입력하면 "안녕하세요" 출력
package rock_sisor_paper;

import java.util.Scanner;

public class rock_sisor_paper_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력하세요:");
		String input = sc.nextLine();
		
		if(input.equals("hello")) {
			System.out.println("안녕하세요");
		}
		else {
			System.out.println("입력값: " + input);
		}
		sc.close();
	}
}