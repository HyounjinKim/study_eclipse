package ex03;

class AA{
	public void doA() {
		System.out.println("doA");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(49));
		AA a2 = new AA();
		a2.doA();
		
		String a = new String("abcd");		
		System.out.println(a.toUpperCase());
	}
}
