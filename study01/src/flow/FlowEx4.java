package flow;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.println("점수입력 > ");
		Scanner scanner = new Scanner(System.in);
		score = Integer.parseInt(scanner.nextLine());
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			
		}
	}
}
