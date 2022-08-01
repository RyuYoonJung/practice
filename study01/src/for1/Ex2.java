package for1;

public class Ex2 {
	public static void main(String[] args) {
		// 1부터 10까지의 합을 for문을 이용해서 출력하시오
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("1부터 %d 까지의 합 = %d%n" , i,  sum);
		}
	}
}
