package chapter_2;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exit 을 입력하면 종료됩니다.");
        while(true){ //한무 반복
            System.out.print(">>");
            String s = scanner.nextLine();

            if(s.equals("exit")){
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
