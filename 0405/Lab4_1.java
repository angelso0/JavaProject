import java.util.Scanner;

public class Lab4_1 {	

	
	public static void main(String[] agrs) 
		{
			 System.out.println
			 		("================"
			 		+ "\n학번: 201804014"
			 		+ "\n이름: 박소영"
			 		+ "\n================"); //한번에 출력해주기 위해 +를 사용
			 			 
			 Scanner sy = new Scanner(System.in);
			 Circle circle = new Circle(3.14159);
			 
			 System.out.println("반지름을 입력해주세요."); //반지름입력출력
			 Circle.radius = sy.nextInt(); //숫자받음
			 
			 System.out.println("반지름: " + Circle.radius); //반지름값 출력
			// System.out.println("넓이: " + Circle.showCircle()); //넓이값 출력
			 System.out.print("넓이: ");
			 circle.showCircle(); //넓이값 출력 showCircle()호출
			
		}


}