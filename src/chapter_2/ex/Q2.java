package chapter_2.ex;

public class Q2 {
    public static void main(String[] args) {
        // 2차원 배열 n을 출력하는 프로그램을 작성
        int val[][] = {
                {1},
                {1,2,3},
                {1},
                {1,2,3,4},
                {1,2}
        };

        for(int i=0; i<val.length; i++){
            for(int j=0; j<val[i].length; j++){
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
    }
}
