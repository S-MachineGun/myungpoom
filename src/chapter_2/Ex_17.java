package chapter_2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum=0, n=0;

        for(int i=0; i<3; i++){
            System.out.print(i+">> ");
            try{
                n=scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력하세요.");
                scanner.nextLine();// 현재 입력 스트림에 남아 있는 토큰을 지움
                i--; //인덱스가 감소하지 않도록 미리 감소
                continue; // 다음 루프
            }
            sum += n; // 합하기
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
