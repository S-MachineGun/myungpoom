package chapter_2;

public class CheckTime_1 {
    public static void main(String[] args) {
        // 별 출력

        // 1. for문
        /**
        for(int i=0; i<=5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
         **/

        // 2. while문
        /**
        int n = 5;
        while(true){
            if(n==0){
                break;
            } else {
                for(int i=0;i<n;i++){
                    System.out.print("*");
                }
                System.out.println();
                n--;
            }
        }
         **/

        // 3. do-while문
        /**
        int n = 5;
        do {
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
            n--;
            if(n==0){
                break;
            }
        } while(true);
         **/

        /**
        for(;;); //무한 루프
         **/

        //  1부터 100까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
