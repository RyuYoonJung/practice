package scanner;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		// 입력 월에 해당하는 계절을 출력하시오
		int month;
		String season = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력해주세요>");
		String input = scanner.nextLine();
		month = Integer.parseInt(input);
		
		switch (month) {
		case 11: case 12: case 1:
			season = "겨울";
			break;
		case 8: case 9: case 10:
			season = "가을";
			break;
		case 5: case 6: case 7:
			season = "여름";
			break;
		case 2: case 3: case 4:
			season = "봄";
			break;

		default:
			System.out.println("입력 내용을 확인해주세요");
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다");
		
	}
}
