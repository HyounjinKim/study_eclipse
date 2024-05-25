package ex04;

public class Ex06 {
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 30;
		
		byte c = (byte)(a * b);

		// 범위를 벗어나면 값이 잘림
		System.out.println(c);
	}
}
