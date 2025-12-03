package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산>>");
        int x = sc.nextInt();
        String s = sc.next();
        int y = sc.nextInt();

        // if else
        /**
        if (s.equals("+")){
            System.out.println(x + s + y+"의 계산 결과는 " + (x+y));
        } else if (s.equals("-")){
            System.out.println(x + s + y+"의 계산 결과는 " + (x-y));
        } else if (s.equals("*")){
            System.out.println(x + s + y+"의 계산 결과는 " + (x*y));
        } else if (s.equals("/")){
            System.out.println(x + s + y+"의 계산 결과는 " + (x/y));
        }
        **/

        // switch
        switch(s){
            case "+":
                System.out.println(x + s + y+"의 계산 결과는 " + (x+y));
                break;
            case "-":
                System.out.println(x + s + y+"의 계산 결과는 " + (x-y));
                break;
            case "*":
                System.out.println(x + s + y+"의 계산 결과는 " + (x*y));
                break;
            case "/":
                System.out.println(x + s + y+"의 계산 결과는 " + (x/y));
                break;
        }

    }
}
