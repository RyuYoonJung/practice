package operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		// 논리연산자 %%(모두 true / and ) || (둘중 하나만 true 여도 true / or)
		Scanner scanner = new Scanner(System.in);
		char ch  = ' ';
		
//		System.out.println("문자를 입력하세요 >");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if(ch >= '0' && ch <= '9') {
//			System.out.printf("입력한 문자는 숫자입니다 %n");
		} 
		if ((ch >='a' && ch <= 'z') || ch >= 'A' && ch <= 'z') {
//			System.out.printf("입력한 문자는 영문자입니다 %n");
		}
		
		int a = 5;
		int b = 0;
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}
}
