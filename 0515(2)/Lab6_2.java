package Lab6_2;

import java.lang.Math;
import java.util.Scanner;

interface Shape{
	 double area();
	 double perimeter();
}


class Square implements Shape {
   double side;
   Square(){
   }
    Square(double side) {
        this.side = side;
    }
 
    public double area() {
        return side * side; // 정사각형의 넓이 구하는 공식
    }
 
    public double perimeter() {
        return (side + side) * 2; // 정사각형의 둘레 구하는 공식
    }
}

class Circle implements Shape {
    double radius;
 
    final double PI = 3.14159; // 원주율
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double area() {
        return PI * radius * radius; // 원의 넓이 공식
    }
 
    public double perimeter() {
    	return 2 * PI * radius; // 원의 들레 공식
    }
 
}

class Triangle implements Shape {
    double a, b, c, s;
 
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
 
    public double area() {
        s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 삼각형 넓이 헤론 공식,  sqrt 는 루트 근삿값
 
    }
 
    public double perimeter() {
        return a + b + c; // 삼각형의 둘레 구하는 공식
    }
}

public class Lab6_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("======================"
        					+ "\n학번: 201804014"
        					+ "\n이름: 박소영"
        					+ "\n======================");
 
        
        System.out.println("원의 반지름을 입력하세요:");
        Circle circle = new Circle(scan.nextDouble()); //원 생성자 호출, 값 입력
        System.out.println("정사각형의 길이를 입력하세요:");
        Square square = new Square(scan.nextDouble()); //정사각형 생성자 호출, 값 입력
       
        System.out.println("삼각형의 a점을 입력하세요:");
        double a = scan.nextDouble(); //삼각형 a점 입력
        System.out.println("삼각형의 b점을 입력하세요:");
        double b = scan.nextDouble(); //삼각형 b점 입력
        System.out.println("삼각형의 c점을 입력하세요:");
        double c = scan.nextDouble(); //삼각형 c점 입력
        Triangle triangle = new Triangle(a, b, c);
 
        System.out.println("원\n넓이: " + circle.area() + "\n둘레: " + circle.perimeter()); //원의 넓이와 둘레 출력하기
        System.out.println("정사각형\n넓이: " + square.area() + "\n둘레: " + square.perimeter()); //정사각형의 넓이와 둘레 출력하기
        System.out.println("삼각형\n넓이: " + triangle.area() + "\n둘레: " + triangle.perimeter());//삼각형의 넓이와 둘레 출력하기
    
 
	}

}
	 