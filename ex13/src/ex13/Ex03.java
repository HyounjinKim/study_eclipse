package ex13;

class AA {
    public static void doPrint() {
        System.out.println("스태틱 doPrint");
    }
}

class AAA {
    public static AA aa = new AA();

    public void doA() {
        System.out.println("AAA doA");
    }
}

public class Ex03 {
    public static void main(String[] args) {
        AAA a = new AAA();
        a.doA();

        AAA.aa.doPrint();

        System.out.println("테스트");

    }
}