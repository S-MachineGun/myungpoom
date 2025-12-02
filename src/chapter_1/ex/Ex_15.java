package chapter_1.ex;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int price = 0;

        System.out.print("무슨 커피 드릴까요? ");
        String coffee = sc.nextLine();

        switch (coffee) {
            case "A" :
            case "카푸치노" :
            case "카페라떼" :
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
        }

        System.out.println(coffee + "는 " + price + "입니다");
    }
}
