package array;

public class Arr3 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int tmp = 0;
		
		
		for(int i = 0; i <= 4; i++) {
//			System.out.printf("score[%d] : %d%n", i, i*10);
			score[i] = i*10;
			for(int ar : score) {
				System.out.println(ar);
			}
		}
		tmp = score[3] + score[4]; 
		System.out.println(tmp);
	}
}
