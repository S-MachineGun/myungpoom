package chapter_1.ex.excercises;
import  java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>>");
        int won = scanner.nextInt();

        double dollar = won/1100;

        System.out.println(won + "원은" + " $" + dollar + "입니다.");
    }
}
