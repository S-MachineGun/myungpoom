package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double rx = sc.nextDouble();
        double ry = sc.nextDouble();
        double r = sc.nextDouble();

        System.out.print("점 입력>>");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double d = (rx-x)*(rx-x)+(ry-y)*(ry-y); //원의 거리 구하기 공식 (좌표 이용시)
        if(r*r>=d){ // 반지름(제곱)이 거리보다 크거나 작을떼
            System.out.println("점 (" + x + ", " + y + ")" + "는 원 안에 있다.");
        } else {
            System.out.println("점 (" + x + ", " + y + ")" + "는 원 안에 없다.");
        }
    }
}
