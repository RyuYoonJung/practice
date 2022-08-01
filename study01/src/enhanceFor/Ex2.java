package enhanceFor;

public class Ex2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int tmp = 0;
		
		for(int ar : arr) {
			System.out.print(ar);
			System.out.println();
		}
		
		System.out.println("===========");
		
		for(int ar : arr) {
			tmp += ar; 
		}
		System.out.println(tmp);
	}
}
