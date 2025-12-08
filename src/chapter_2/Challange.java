package chapter_2;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Challange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int count = 0;
        int min = 0;
        int max = 99;

        int k = r.nextInt(100); // 0~99까지 임의의 정수 생성

        System.out.println("수를 결정 하였습니다. 맞추어 보세요");

        while (true) {
            System.out.println(min + "-" + max);
            System.out.print(count + ">>");

            int n;

            // -------------------------
            // ✨ 숫자 입력 예외 처리
            // -------------------------
            try {
                n = input.nextInt();   // 문자를 입력하면 예외 발생
            } catch (InputMismatchException e) {
                System.out.println("⚠ 숫자를 입력해야 합니다. 다시 입력하세요.");
                input.nextLine(); // 버퍼 비우기
                continue;
            }

            // -------------------------
            // ✨ 범위 검사 (0~99)
            // -------------------------
            if (n < 0 || n > 99) {
                System.out.println("⚠ 0 이상 99 이하의 숫자만 입력 가능합니다.");
                continue;
            }

            if (n > k) {
                System.out.println("더 낮게");
                max = n;
            } else if (n < k) {
                System.out.println("더 높게");
                min = n;
            } else {
                System.out.println("맞았습니다.");
                System.out.println("다시하시겠습니까(y/n)>>");
                String s = input.next();

                if (s.equalsIgnoreCase("y")) {
                    k = r.nextInt(100);
                    System.out.println("수를 결정 하였습니다. 맞추어 보세요");
                    min = 0;
                    max = 99;
                    count = 0;
                    continue;
                } else if (s.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("⚠ y 또는 n만 입력 가능합니다. 게임을 종료합니다.");
                    break;
                }
            }
            count++;
        }
    }
}
