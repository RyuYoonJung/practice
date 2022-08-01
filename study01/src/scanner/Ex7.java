package scanner;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		// 주민번호 뒷번호의 첫째 자리를 확인하여 성별을 출력하시오
		char num = ' ';
		String gender = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요>");
		String input = scanner.nextLine();
		
		num = input.charAt(6);
		System.out.println(num);

		switch (num) {
		case '1' : case '3' :
			gender = "남자";
			break;
		case '2' : case '4' :
			gender = "여자";
			break;
		}	
		System.out.println(gender);
		System.out.println("당신의 성별은 " + gender + "입니다");
//		System.out.printf("당신의 성별은 %c 입니다", gender);
	}
}
// 9409122164816