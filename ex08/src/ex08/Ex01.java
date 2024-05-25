package ex08;

import java.util.Iterator;

public class Ex01 {
    public static void main(String[] args) {
        String answer = "";

        String a = "aaaaaa";
        String b = "bbbbbb";
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        for (int i = 0; i < ac.length; i++) {
            System.out.print(ac[i]);
            System.out.print(bc[i]);

            answer = answer + ac[i] + bc[i];
        }
        System.out.println();
        System.out.println("answer : " + answer);
    }
}
