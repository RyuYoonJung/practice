package for2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		String m1 = "딸기";
		String m2 = "사과";
		String m3 = "앵두";
		System.out.printf(" <오늘의 과일>%n (1)%s%n (2)%s%n (3)%s%n", m1, m2, m3 );
		
		while(true) {
			System.out.println();
			System.out.println("원하시는 과일을 선택해주세요 > (종료:0)");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int menue = Integer.parseInt(input);

			switch (menue) {
			case 1:
				System.out.printf("선택하신 과일은 %s 입니다", m1);
				break;
			case 2:
				System.out.printf("선택하신 과일은 %s 입니다", m2);
				break;
			case 3:
				System.out.printf("선택하신 과일은 %s 입니다", m3);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				break;
				
			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
			
		}
	}
}
