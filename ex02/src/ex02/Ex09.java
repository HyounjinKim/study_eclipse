package ex02;

public class Ex09 {
	
	public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
        	answer = 1;
		}
        else
        	answer = -1;
        return answer;
    }
	
	public static void main(String[] args) {
		int num1 = 2;
        int num2 = 3;        
        
        int result = solution(num1, num2);
        
        System.out.println(result);
        
	}
		
}
