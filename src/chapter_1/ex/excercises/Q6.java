package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int n =  input.nextInt();

        if(n>=100 || n<1) {
            System.out.println("1~99 사이의 숫자까지만 입력가능합니다.");
        } else {
            System.out.print("박수");

            if(n/10%10 == 3 || n/10%10 == 6 || n/10%10 == 9){
                System.out.print("짝");
            }

            if(n%10 == 3 || n%10 == 6 || n%10 == 9){
                System.out.print("짝");
            }
        }


    }
}
