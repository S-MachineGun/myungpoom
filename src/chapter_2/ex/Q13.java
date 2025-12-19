package chapter_2.ex;

public class Q13 {
    public static void main(String[] args) {


        for(int i=1; i<100; i++){
            if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i/10 == 3 || i/10 == 6 || i/10 == 9) {
                System.out.print(i + " 박수");
                if((i%10 == 3 || i%10 == 6 || i%10 == 9) && (i/10 == 3 || i/10 == 6 || i/10 == 9)){
                    System.out.println(" 짝짝");
                } else {
                    System.out.println(" 짝");
                }
            }
        }
    }
}
