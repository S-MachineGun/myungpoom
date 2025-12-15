package chapter_2.ex;
import java.util.Arrays;
import java.util.Random;

public class Q10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int r = (int)(Math.random()*10+1);
        int [][]val =  new int[4][4];
        int zeros = 6;
        int spaces = 16;

        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                if(zeros == spaces) {
                    val[i][j] = 0;
                    zeros --;
                } else if(zeros > 0 &&  rand.nextBoolean()){
                    val[i][j] = 0;
                    zeros --;
                } else {
                    int num;
                    do {
                        num = rand.nextInt(r);
                    } while(num == 0);
                    val[i][j] = num;
                }
                spaces--;
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }

    }
}
