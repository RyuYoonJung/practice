package scanner;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		// 점수에 따라 a, b, c, d, 등급으로 나누고 + 옵션을 추가하여 출력하시오
		int score;
		char grade = ' ';
		char opt = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요>");
		String input = scanner.nextLine();
		score = Integer.parseInt(input);
		
		switch (score) {
		case 90: case 80:
			grade = 'a';
			if(90 <= score) {
				opt = '+';
			}
			break;
		case 70: case 60:
			grade = 'b';
			if(70 <= score && score < 80) {
				opt = '+';
			}
			break;
		case 50: case 40:
			grade = 'c';
			if(50 <= score && score < 60) {
				opt = '+';
			}
			break;
		}
		System.out.println("당신의 학점은 " + grade + opt + "입니다");
	}
}
