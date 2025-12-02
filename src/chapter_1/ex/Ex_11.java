package chapter_1.ex;
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수를 입력하시오: ");
        int n = sc.nextInt();

        if(n%3==0){
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
