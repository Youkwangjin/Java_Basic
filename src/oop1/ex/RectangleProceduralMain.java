package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;    // 가로
        int height = 8;   // 세로

        int area = calculateArea(width, height);
        System.out.println("넓이는 : " + area);
        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레길이는 : " + perimeter);
        boolean square = isSquare(width, height);
        System.out.println("여부 확인은 : " + square);


    }

    // 직사각형 넓이
    static int calculateArea(int width, int height) {
        return width * height;
    }
    // 직사각형 둘레 길이 구하기
    static int calculatePerimeter(int width, int height) {
        return width * 2 + height * 2;
    }
    // 정사각형 여부 확인
    static boolean isSquare(int width, int height) {
        return width == height;
    }

}
