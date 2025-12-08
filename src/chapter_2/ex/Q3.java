package chapter_2.ex;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오>>");
        int num = scanner.nextInt();

        for(int i=0; i<num; i++){
            for(int j=i; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
