package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int n = sc.nextInt();

        if(n/10%10 == n%10){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("No.. 10의 자리와 1의 자리가 틀립니다.");
        }


        System.out.println(n/10%10);
        System.out.println(n%10);
    }
}
