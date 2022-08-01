package for1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
//		String num;
//		
//		num = "12123456";
//		
//		char point = num.charAt(5);
//		System.out.println(point);
		
		int num = 0;

		System.out.println("*을 출력할 라인수를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1; j <= 5 ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
