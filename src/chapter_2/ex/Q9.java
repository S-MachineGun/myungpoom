package chapter_2.ex;
import java.util.Random;

public class Q9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = (int)(Math.random()*10+1);
        int [][] val = new int[4][4];

        for(int i=0;i<val.length;i++){
            for(int j=0; j<val[i].length;j++){
                val[i][j] = rand.nextInt(r);
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
    }
}
