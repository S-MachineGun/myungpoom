package chapter_2;

public class Ex_1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++){
            sum += i;
            System.out.print(i); // 더하는 수 출력
            if(i<=9){
                System.out.print("+");// 1~9까지 + 출력
            } else { // i가 10일때
                System.out.print("=");
                System.out.print(sum);
            }

        }
    }
}
