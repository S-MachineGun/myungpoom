package chapter_1.ex;

public class Ex_3 {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b+i); // b를 int 타입으로 자동 변환
        System.out.println(10/4); // 정수 나누기
        System.out.println(10.0/4); // 실수 나누기
        System.out.println((char)0x12340041); // char로 변환
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
