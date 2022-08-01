package operator;

public class OperatorEx4 {
	public static void main(String[] args) {
		// 삼항연산자
		
		int x, y, z;
		int absX, absY, absZ;
		char singnX, singnY, singnZ;
		
		x = -10;
		y = 5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		System.out.println(absX);
		System.out.println(absY);
		System.out.println(absZ);
		
		
		
	}
}
