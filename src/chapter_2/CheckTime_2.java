package chapter_2;
import java.util.Scanner;

public class CheckTime_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. 10개의 정수를 저장하는 배열 tenArray을 선언하고 생성하는 코드를 생성'
        int [] tenArray = new int[10];
        int sum = 0;
        System.out.println("10개의 정수를 입력하세요");
        for(int i=0; i<tenArray.length;i++){
            tenArray[i] = input.nextInt();
        }

        // 3. 1~10까지 저장하고 원소의 모든 값을 더해서 출력
        for(int k: tenArray){
            sum += k;
        }

        for(int k : tenArray){
            System.out.print(k+" ");
        }
        System.out.println();

        // 2. tenArray의 크기
        System.out.println(tenArray.length);

        System.out.println(sum);

    }
}
