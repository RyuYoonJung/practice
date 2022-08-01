package array;

public class Arr1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int ar : arr) {
			System.out.print(ar);
			System.out.println();
		}
		
		int [] arr2 = new int[5];
		
		arr2[2] = 100;
		
		int value = arr2[2];
		System.out.println(value);
		
		System.out.println("=============");
		
		int[] score = new int[4];
		score[0] = 0; 
		score[1] = 10; 
		score[2] = 20; 
		score[3] = 30; 

		for(int sc : score) {
			System.out.println(sc);
		}
	}
}
