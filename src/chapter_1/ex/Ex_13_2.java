package chapter_1.ex;

import java.util.Scanner;

public class Ex_13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        System.out.print("점수 입력하거라:");
        int score = sc.nextInt();
        System.out.print("학년 입력하거라:");
        int year = sc.nextInt();

        String result = ((year == 4 && score < 69) || score < 60) ? "불합격" : "합격";

        System.out.println(result);

    }
}
