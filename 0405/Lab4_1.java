import java.util.Scanner;

public class Lab4_1 {	

	
	public static void main(String[] agrs) 
		{
			 System.out.println
			 		("================"
			 		+ "\n�й�: 201804014"
			 		+ "\n�̸�: �ڼҿ�"
			 		+ "\n================"); //�ѹ��� ������ֱ� ���� +�� ���
			 			 
			 Scanner sy = new Scanner(System.in);
			 Circle circle = new Circle(3.14159);
			 
			 System.out.println("�������� �Է����ּ���."); //�������Է����
			 Circle.radius = sy.nextInt(); //���ڹ���
			 
			 System.out.println("������: " + Circle.radius); //�������� ���
			// System.out.println("����: " + Circle.showCircle()); //���̰� ���
			 System.out.print("����: ");
			 circle.showCircle(); //���̰� ��� showCircle()ȣ��
			
		}


}