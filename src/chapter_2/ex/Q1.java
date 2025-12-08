package chapter_2.ex;

public class Q1 {

    // 2. 위에 코드를 main() 메소드로 만들고 WhileTest 클래스로 완성
    /**
    public static int WhileTest(int sum, int i){
        while(i<100){
            sum += i;
            i += 2;
        }

        return sum;
    }
     **/

    // 3.for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성
    /**
    public static int ForTest(){
        for(i=0; i<100; i+=2){
            sum += i;
        }
        return sum;
    }
     **/

    // 4. do-while문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성
    public static int DoWhileTest(){
        int sum = 0;
        int i=0;
        do {
            sum += i;
            i += 2;
        } while(i<100);
        return sum;
    }

    public static void main(String[] args) {
        int sum=0, i=0;

        // 1. 0에서 99까지 짝수들의 합
        /**
        while(i<100){
            sum += i;
            i += 2;
        }
        System.out.println(sum);
         **/

        /**
        // 2. //
        sum = WhileTest(sum,i);
        System.out.println(sum);
         **/

        /**
        // 3. //
        sum = ForTest(sum, i);
        System.out.println(sum);
         **/

        // 4. //
        sum = DoWhileTest();
        System.out.println(sum);
    }
}
