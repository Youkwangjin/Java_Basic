package oop1.ex;

public class Rectangle {
    int width = 8;
    int height = 8;

    void calculateArea() {
         System.out.println("직사각형의 넓이는 : " + width * height);
    }

    void calculatePerimeter() {
        System.out.println("직사각형의 둘레길이는 : " + 2 * (width + height));
    }

    void isSquare() {
        System.out.println("직사각형 여부 확인 : " + (width == height));
    }
}
