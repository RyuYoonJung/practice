package array;

public class Arr2 {
	public static void main(String[] args) {
		int[] score = new int[4];  
		for(int i = 0; i <= 3; i++) {
			System.out.println(score[i] = i * 10);
			System.out.printf("score[%d] = %d%n", i, i*10 );
		}
	}
}
