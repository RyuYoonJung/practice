package variable;

public class PrintfEx1 {
	public static void main(String[] args) {
		byte b =1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000L;
		long hex = 0xFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		
		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d %n", c, (int)c);
//		System.out.printf("finger = [%.2l]%n,", big); float 타입
		
		
		
	}
}