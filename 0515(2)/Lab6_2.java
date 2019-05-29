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
        return side * side; // ���簢���� ���� ���ϴ� ����
    }
 
    public double perimeter() {
        return (side + side) * 2; // ���簢���� �ѷ� ���ϴ� ����
    }
}

class Circle implements Shape {
    double radius;
 
    final double PI = 3.14159; // ������
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double area() {
        return PI * radius * radius; // ���� ���� ����
    }
 
    public double perimeter() {
    	return 2 * PI * radius; // ���� �鷹 ����
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
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // �ﰢ�� ���� ��� ����,  sqrt �� ��Ʈ �ٻ�
 
    }
 
    public double perimeter() {
        return a + b + c; // �ﰢ���� �ѷ� ���ϴ� ����
    }
}

public class Lab6_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("======================"
        					+ "\n�й�: 201804014"
        					+ "\n�̸�: �ڼҿ�"
        					+ "\n======================");
 
        
        System.out.println("���� �������� �Է��ϼ���:");
        Circle circle = new Circle(scan.nextDouble()); //�� ������ ȣ��, �� �Է�
        System.out.println("���簢���� ���̸� �Է��ϼ���:");
        Square square = new Square(scan.nextDouble()); //���簢�� ������ ȣ��, �� �Է�
       
        System.out.println("�ﰢ���� a���� �Է��ϼ���:");
        double a = scan.nextDouble(); //�ﰢ�� a�� �Է�
        System.out.println("�ﰢ���� b���� �Է��ϼ���:");
        double b = scan.nextDouble(); //�ﰢ�� b�� �Է�
        System.out.println("�ﰢ���� c���� �Է��ϼ���:");
        double c = scan.nextDouble(); //�ﰢ�� c�� �Է�
        Triangle triangle = new Triangle(a, b, c);
 
        System.out.println("��\n����: " + circle.area() + "\n�ѷ�: " + circle.perimeter()); //���� ���̿� �ѷ� ����ϱ�
        System.out.println("���簢��\n����: " + square.area() + "\n�ѷ�: " + square.perimeter()); //���簢���� ���̿� �ѷ� ����ϱ�
        System.out.println("�ﰢ��\n����: " + triangle.area() + "\n�ѷ�: " + triangle.perimeter());//�ﰢ���� ���̿� �ѷ� ����ϱ�
    
 
	}

}
	 