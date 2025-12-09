package chapter_2.ex;
import java.util.Random;

public class Q7 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int i = (int)(Math.random()*10+1);
        int val[] = new int[10];

        System.out.print("랜덤한 정수들 : ");
        for(int j=0; j<val.length; j++){
            val[j] = r.nextInt(i);
            System.out.print(val[j] + " ");
            sum += val[j];
        }
        System.out.println();
        System.out.println("평균은 " + (double)sum/10);
    }
}
