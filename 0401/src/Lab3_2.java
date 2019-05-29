import java.util.Scanner;

public class Lab3_2 {
	public static void p (String str) {
		System.out.println(str); //메소드
	}

	public static void main(String[] agrs) //2차원 정렬 값 받기
		{
			 p //출력해주기위함
			 		("================"
			 		+ "\n학번: 201804014"
			 		+ "\n이름: 박소영"
			 		+ "\n================"); //한번에 출력해주기 위해 +를 사용
			 

			 Scanner sy =new Scanner(System.in);
			 p("행렬의 크기를 입력하세요.");
			 int rows = sy.nextInt();
			 int cois = sy.nextInt();
			 
			 
			 
			 int array1[][] = new int[rows][cois]; //2차원 배열 선언1
			
			 p("1번째 matrix");
			 for(int i = 0; i<array1.length; i++) {
				 for(int j=0; j<array1[i].length; j++) {
					 System.out.print("("+i+", "+j+ ") : ");
					 array1[i][j]=sy.nextInt();

			 
				 }
			 } 
			 for (int i = 0 ; i< array1.length; i++){
				 for (int j = 0 ;j< array1[i].length; j++) {
					 System. out.print (array1[i][j]+"\t");
				 }
			 	 System. out.println ();
			 }

			 int array2[][] = new int[rows][cois]; //2차원 배열 선언2
			 p("2번째 matrix");
			 for(int i = 0; i<array2.length; i++) {
				 for(int j = 0; j<array2[i].length; j++) {
					 System.out.print("("+i+", "+j+ ") : ");
					 array2[i][j]=sy.nextInt();					 
				 }
				 
			 }
			 
			 for (int i = 0 ; i< array2.length; i++){
				 for (int j = 0 ;j<array2[i].length; j++) {
					 System. out.print (array2[i][j]+"\t");
				 }
			 	 System. out.println ();
			 }
					 
			 int result[][] = new int[rows][cois]; //2차원 배열 (결과)
			 p("결과");
			 for (int i = 0 ; i< result.length; i++){
				 for (int j = 0 ;j < result[i].length; j++) {
					 result[i][j] = array1[i][j] + array2[i][j]; //두개의 배열을 더해줌
					 System.out.print (result[i][j]+"\t");
				 }
			 	 System. out.println ();
		
			 }
		}
	}