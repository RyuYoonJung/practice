package enhanceFor;

public class Ex3 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		String[] str = {"가가","나나","다다","라라"} ;
		int idx = 1;
		for(String sr : str) {
			System.out.print(sr + idx++);
			System.out.println();
		}
		
		System.out.println("==========");
		System.out.println(arr.length);
		System.out.println("==========");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
