package ex02;

import java.util.Scanner;

public class Ex08 {
    // 숫자 2개를 입력받아 더한 값 출력
    // scanner 안에 있는 함수
    // nextline 문자열을 받는다.
    // nextInt 정수를 받는다.

    // num1 과 num2 매개변수로 받고 int형을 돌려주는 solution 함수
    public static int solution(int num1, int num2) {
        num1 = 10;

        return num1 + num2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력");
        int num1 = scan.nextInt();

        System.out.println("숫자 입력");
        int num2 = scan.nextInt();

        int result = solution(num1, num2);

        System.out.println("결과 : " + result);
        System.out.println(num1);

        int result1 = solution(num1, num2);

        System.out.println("결과 : " + result1);

    }
}
