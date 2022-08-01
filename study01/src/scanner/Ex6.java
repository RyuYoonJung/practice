package scanner;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		// 입력 월에 해당하는 계절을 출력하시오
		int month;
		String season = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력해주세요>");
		String input = scanner.nextLine();
		month = Integer.parseInt(input);
		
		if(month == 1 || month == 2 || month == 3) { 
			season = "봄";
		} else if (month == 4 || month == 5 || month == 6) {
			season = "여름";
		} else if (month == 7 || month == 8 || month == 9) {
			season = "가을";
		} else {
			season = "겨울";
		}
		System.out.println("현재 계절은 " + season + "입니다");
	}
}
