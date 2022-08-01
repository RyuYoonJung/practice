package variable;

import java.util.Date;

public class Variable {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		String name = "홍길동";
		String str = name + 8;
		int grade = 4;
		int age = 20;
		System.out.println(name);
		System.out.println(str);
		
		System.out.printf("이름 %s, 학년 : %d, 나이 : %d ", name, grade, age);
	}
}
