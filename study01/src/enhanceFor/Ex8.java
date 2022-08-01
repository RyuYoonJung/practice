package enhanceFor;

public class Ex8 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		while((sum += ++num) <= 100) {
			System.out.printf("sum = %d  num = %d%n", sum, num);
		}
	}
}
