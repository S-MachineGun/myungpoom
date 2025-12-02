package chapter_1.ex;
import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int grade = sc.nextInt();

        System.out.print("학년을 입력하세요: ");
        int year = sc.nextInt();

        if(grade >= 60){
            if(year == 4 && grade < 69) {
                System.out.println("불합격");
            } else {
                    System.out.println("합격");
                }
            }  else {
            System.out.println("불합격");
            }
        }
    }

