package scanner;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		// 입력받은 점수의 등급을 나눠 출력하시오
		int score;
		String grade = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요>");
		
		String input = scanner.nextLine();
		score = Integer.parseInt(input);
		
		if(50 <= score && score <= 60) {
			grade = "a학점";
		} else if(70 <= score && score <= 80) {
			grade = "b학점";
		} else if(90 <= score && score <= 100) {
			grade = "c학점";
		} else {
			System.out.println("점수를 다시 입력해주세요");
		}
		System.out.println("당신의 학점은" + grade + "입니다");
	}
}
