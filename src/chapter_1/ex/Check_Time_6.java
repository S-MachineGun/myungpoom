package chapter_1.ex;

public class Check_Time_6 {
    public static void main(String[] args) {
        int x = 2, y = 10, z = 0;
        z = x++*2+--y-5+x*(y%2);
        System.out.println(z);

        System.out.println(8 >> 2);
        System.out.println(-16 >> 2);

        int opr = 4;
        System.out.println(opr++);
    }
}
