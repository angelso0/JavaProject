import java.util.Scanner;


public class Lab7_2 {

	public static void main(String[] args) {
		String name;
		int num;
		
		Scanner sy = new Scanner(System.in);
		
		System.out.println("============="
				+"\n�й�: 201804014"
				+"\n�̸�: �ڼҿ�"																
				+"\n=============");


			System.out.println("�̸�: ");
			name = sy.nextLine();
			System.out.println("�а��� �������ּ���");
			System.out.println("(1.���� 2.�纹 3.���� 4.�ļ� 5.��ȣ)"); //1~5�� ����
			num = sy.nextInt();
			System.out.println("======�й� ���� �Ϸ�======");
			MakeStudentld st = new MakeStudentld(name,num);
			System.out.println("�̸�:"+st.getName()); //�̸�����
			System.out.println("�а�:"+st.getDept()); //�а�����
			System.out.println("�й�:"+st.makeId()); //�й�����
			

			
	

	}
	
	
}
