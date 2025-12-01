package chapter_1.ex;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요:");
        int n = scanner.nextInt();

        int hour = (n/60)/60;
        int minute = (n/60)%60;
        int second = n%60;

        System.out.println(n + "초는 " + hour + ("시간, ") +  minute + ("분, ")+ second + ("초입니다."));


    }
}
