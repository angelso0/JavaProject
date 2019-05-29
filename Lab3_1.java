import java.util.Scanner;
public class Lab3_1 {
	public static void p (String str) {
		System.out.println(str); //메소드
	}

	public static void main(String[] agrs) //메인함수
		{
			 p //출력해주기위함
			 		("================"
			 		+ "\n학번: 201804014"
			 		+ "\n이름: 박소영"
			 		+ "\n================"); //한번에 출력해주기 위해 +를 사용 
		
			 
			 Scanner sy=new Scanner(System.in);
			 int a = 0;
			 int i = 0;
			 int k = 0;
			 int yo = 0;		    	 // 변수들 초기화
			
			 do{

			 p ("학생 수를 입력해주세요.");
			
		     a = sy.nextInt(); //힉생 수 입력 받음
    	 	 int so [] = new int [a] ; //학생수 so에 넣음, 점수 입력	
    	 	 if (a>0) {
		     p (a+"명의 프로그래밍 점수를 입력해주세요.(0~100)"); //학생 수 점수 입력받은 것 입력해야함
		     for (i = 0; i <a ; i++){ //점수 입력
    	  		    	 
			    	 System. out.print(i+1+":"); 
			    	 so [i] = sy.nextInt(); 
			    	 //System. out.println(so[i]);
		    	 
		    	 if (0 <= so[i] && so[i] <= 100) {
		    		 
		    	 }
		    	 else{
			    	 p("잘못 입력하셨습니다.\n"
			    	 		+ (i+1) +"번째 학생의 점수는 0점으로 처리 됩니다.");
			    	 so [i] = 0;
			    	 }

		     }		
		     
		     for (i = 0; i < a; i++){
			    //System.out.println(so[i]);
		    	 yo = so [i]/10;
		    	 if (yo<1) {
		    		yo = yo+1;
		    	 }
			    
			    System.out.print ((i+1)+"번 "+so[i]+"점 : ");
			    for (k = 0; k < yo; k++) {
			    	System.out.print("*");}
			    p("");}
		     }
			 }while (a!=0);
			p("학생수를 잘못 입력하셨습니다. 시스템이 종료됩니다.");}//학생 수 0  입력하면 시스템 종료
 
	}