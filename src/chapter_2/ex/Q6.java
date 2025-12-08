package chapter_2.ex;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int count = 0;
        System.out.print("금액을 입력하시오>>");
        int n = scanner.nextInt();

        for(int i=0; i<unit.length; i++){
                System.out.println(unit[i]+"원 짜리 : " +i+"개");
        }



    }
}
