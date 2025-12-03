package chapter_1.ex.excercises;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        int d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2); // 원의 거리 구하기 공식 (두 개의 원끼리 비교할 시)

        if(Math.sqrt(d)<=r1+r2){ // 거리의 제곱이 각 원들의 반지름의 합보다 작거나 같을때
            System.out.println("두 원은 서로 겹친다.");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }
    }
}
