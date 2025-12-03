package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int ffD = 0;
        int tD = 0;
        int oD = 0;
        int h = 0;
        int fT = 0;
        int t = 0;
        int o = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int price = input.nextInt();

        if(price >= 50000){
            ffD = price / 50000;
        }

        if(price >= 10000){
            tD = price % 50000 / 10000;
        }

        if(price >= 1000){
            oD = price % 10000 / 1000;
        }

        if(price >= 100){
            h = price  % 1000 / 100;
        }

        if(price >= 50){
            fT = price % 100 / 50;
        }

        if(price >= 10){
            t =  price % 50 / 10;
        }

        if(price >= 1){
            o = price % 10;
        }

        System.out.println("오만원권 " + ffD + "매");
        System.out.println("만원권 " + tD + "매");
        System.out.println("천원권 " + oD + "매");
        System.out.println("백원 " + h + "개");
        System.out.println("오십원 " + fT + "개");
        System.out.println("십원 " + t + "개");
        System.out.println("일원 " + o + "개");

    }
}
