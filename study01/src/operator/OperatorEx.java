package operator;

public class OperatorEx {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
//		System.out.printf("%d를 %d로 나누면, %n", x ,y );
//		System.out.printf("몫은 %d 이고, 나머지는 %d 이다", x/y, x%y); // 나머지 연산자로 나머지 구하기
		
		// 비교연산자
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println(str2);
		
		System.out.printf("str1.equals(abc) ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(abc) ? %b%n", str2.equals("abc")); // 객체 달라도 내용만 같으면 true (그래서 문자열 비교시 equals 쓰는거)
		System.out.printf("str2.equals(abc) ? %b%n", str2.equals("ABC"));
		System.out.printf("str2 == abc ? %b%n", str2 == "abc"); // 객체가 서로 달라서 리터럴이 같아도 false
		System.out.printf("str1 == abc ? %b%n", str1 == "abc");
		System.out.printf("str2.equals(abc) ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		
		
		
	}
}
