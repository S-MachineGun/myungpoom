package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mid = 0;

        System.out.print("정수 3개 입력>>");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a < c){
            mid = a;
        } else if (b > a && b < c){
            mid = b;
        } else  {
            mid = c;
        }

        System.out.println("중간 값은 " + mid);
    }
}
