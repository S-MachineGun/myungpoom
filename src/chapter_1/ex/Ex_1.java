package chapter_1.ex;

public class Ex_1 {

    public static int sum(int n, int m){
        return n+m;
    }

    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // 메서드 호출;
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
