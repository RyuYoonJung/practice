package enhanceFor;

public class Ex9 {
	public static void main(String[] args) {
		// 무한반복문 탈출 break
		// 몇까지 더했을때 합이 100을 넘지 않는지 구하는 수식
		
		int i = 0;
		int sum = 0;

		while(true) {
			if(sum > 100) {
				break;
			}
			sum += ++i;
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
