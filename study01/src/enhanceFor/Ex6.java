package enhanceFor;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		System.out.print("숫자를 입력하세요 >");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		while(num != 0) {
			sum += num%10;
			System.out.printf("sum = %d num = %d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합:" + sum );
	}
}
