package chapter_2;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];
        int sum = 0;

        System.out.print("5개의 정수를 입력하세요.");
        for(int i=0; i<intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }

        for(int i=0; i<intArray.length; i++){
            sum += intArray[i];
        }

        double average = (double)sum/intArray.length;
        System.out.println("평균은 " + average);
    }
}
