package for1;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
//		String num;
//		
//		num = "12123456";
//		
//		char point = num.charAt(5);
//		System.out.println(point);
		
		int num;

		System.out.println("*을 출력할 라인수를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1; j <= 5 ; j ++) {
				if(i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else if (0 > i-j) {
					System.out.printf("[%d, %d]", i, j);
				}
			}
			System.out.println();
		}
	}
}
