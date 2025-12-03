package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오>>");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a+b>c){
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 안됩니다.");
        }
    }
}
