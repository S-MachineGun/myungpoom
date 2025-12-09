package chapter_2.ex;
import java.util.Arrays;
import java.util.Random;

public class Q10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int r = (int)(Math.random()*10+1);
        int [][]val =  new int[4][4];

        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                val[i][j] = rand.nextInt(r);
                if(val[i][j] == 0) {
                    count++;
                    if(count>6) {
                        val[i][j] = rand.nextInt(r);
                    } else {
                        System.out.print(val[i][j] + " ");
                    }
                } else {
                    System.out.print(val[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
