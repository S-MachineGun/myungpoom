package chapter_2.ex;
import java.util.Scanner;
import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개? ");
        int n = scanner.nextInt();
        int[] val = new int[n];

        for(int i = 0; i < n; i++){
            val[i] = ran.nextInt(100) + 1; // 1~100
            for(int j = 0; j < i; j++){
                if(val[i] == val[j]) {
                    i--;        // 다시 뽑기
                    break;      // 중복 발견 즉시 탈출
                }
            }
        }

        // 출력
        System.out.println("생성된 정수들:");
        for(int i = 0; i < n; i++){
            System.out.print(val[i] + " ");
        }
    }
}
