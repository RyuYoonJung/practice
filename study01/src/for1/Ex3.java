package for1;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("i      2*i      2*i-1      i*i      ii-i      i%3      i/3");
		System.out.println("===========================================================");
		
		for(int i = 1; i <= 10; i++) {
//			System.out.print(i  +  ' ' +   2*i  +  ' ' +   2*i-1  +  ' ' +   i*i  +  ' ' +   11-i  +  ' ' +   i%3  +  ' ' +   i/3);
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i,  2*i , 2*i-1, i*i , 11-i , i%3 , i/3 );
		}
	}
}
