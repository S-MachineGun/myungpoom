package chapter_2.ex;
import java.util.Scanner;
import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        Random ran = new Random();
        int r = (int)(Math.random()*100+1);
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개?");
        int n = scanner.nextInt();
        int [] val = new int[n+1];

        for(int i=0; i<val.length-1; i++){
            if(val[i]==val[i+1]){
                val[i] = ran.nextInt(r);
            }
            System.out.print(val[i] + " ");
        }

    }
}
