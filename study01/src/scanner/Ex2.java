package scanner;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요> ");
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용" + input);
		System.out.println("형변환" + num);
	}
}
