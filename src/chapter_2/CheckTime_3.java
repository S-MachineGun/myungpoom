package chapter_2;
import java.util.Scanner;

public class CheckTime_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intArray[][] = new int [2][3];
        String[] nums = {"첫" , "둘"};

        for(int i = 0; i<intArray.length; i++){
            System.out.print(nums[i] + "째행 3개의 값들을 입력해주세요.>>");
            for(int j = 0; j <intArray[i].length; j++){
                intArray[i][j] = sc.nextInt();
            }
        }

        System.out.print("첫째 행들의 값: ");
        for(int k: intArray[0]){
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.print("둘째 행들의 값: ");
        for(int k: intArray[1]){
            System.out.print(k + " ");
        }
        System.out.println();

    }
}
