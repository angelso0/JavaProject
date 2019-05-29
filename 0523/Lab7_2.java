import java.util.Scanner;


public class Lab7_2 {

	public static void main(String[] args) {
		String name;
		int num;
		
		Scanner sy = new Scanner(System.in);
		
		System.out.println("============="
				+"\n학번: 201804014"
				+"\n이름: 박소영"																
				+"\n=============");


			System.out.println("이름: ");
			name = sy.nextLine();
			System.out.println("학과를 선택해주세요");
			System.out.println("(1.성서 2.사복 3.영보 4.컴소 5.간호)"); //1~5중 선택
			num = sy.nextInt();
			System.out.println("======학번 생성 완료======");
			MakeStudentld st = new MakeStudentld(name,num);
			System.out.println("이름:"+st.getName()); //이름받음
			System.out.println("학과:"+st.getDept()); //학과받음
			System.out.println("학번:"+st.makeId()); //학번받음
			

			
	

	}
	
	
}
