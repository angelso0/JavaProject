import java.util.ArrayList; //arrylist �ҷ���
import java.util.Scanner; // scanner �ҷ���

class Student { //Ŭ����
   String name; //�̸� ����
   String dept; //�а� ����
   int grade; //�г� ����

   public Student(String name, String dept, int grade) { //Scanner�� ���� ����
      this.name = name; //�̸� ������������
      this.dept = dept; //�а� ������������
      this.grade = grade; //�г� ������������
   }
   public void list() { //�̸�,�а�,�г� ������ ����Ʈ
      System.out.println("�̸� :"+name); //����Ʈ�� �̸��޾���
      System.out.println("�а� :"+dept); //����Ʈ�� �̸��޾���
      System.out.println("�г�:"+grade); //����Ʈ�� �̸��޾���
   }
}

public class Lab8_1 { //����
   public static void main(String[] args) { //�޼ҵ弱�� ����
      // TODO Auto-generated method stub
	   
		System.out.println("=============" 
				+"\n�й�: 201804014"
				+"\n�̸�: �ڼҿ�"																
				+"\n============="); //201804014�ڼҿ�
	   
      ArrayList<Student> student = new ArrayList<Student>(); //��ü�ҷ���
      Scanner kbd = new Scanner(System.in); //Scanner�ҷ���
      System.out.println(">>�л� ���� �ý���<<"); //���
      Student s =null; //��ü �ʱ�ȭ
      int n = 0; //n�ʱ�ȭ
      do { //do~while ��
         System.out.println("1.�л� ���  2.�л� ���� 3.�л� ����Ʈ 0.����"); //����Ʈ���
         n = kbd.nextInt(); //����Ʈ ��ȣ �Է�
         switch (n) { //0~1����
         case 1: //1�� �Է½�
            System.out.println("�̸� : "); //�̸�: ���
            String name = kbd.next(); //name �Է�
            System.out.println("�а�:"); //�а�: ���
            String dept = kbd.next(); //dept �Է�
            System.out.println("�г�: "); //�г�: ���
            int grade = kbd.nextInt(); //grade �Է�
            s= new Student(name,dept,grade); //�л� ������ ȣ��
            student.add(s); //�߰�
            break; //�׸��� ���� break
         case 2: //2�� �Է½�
            for(int i = 0;  i<student.size();i++) {  //for���� �̿��ؼ� ���ȣ��ŭ �ݺ�
               System.out.println("====="+(i+1)+"======="); //���ȣ ���
               student.get(i).list(); //��ȿ� �ִ� ����Ʈ�Լ� ���
            }
            System.out.println("������ �л���ȣ:"); //������ �л���ȣ: ���
            int num = kbd.nextInt(); //��ȣ�Է�
            student.remove(num-1); //������ ������ �л� -1��
            break; //break
         case 3:  //3�� �Է½�
            for(int i = 0;  i<student.size();i++) { //for���� �̿��ؼ� ���ȣ��ŭ �ݺ�
               System.out.println("====="+(i+1)+"======="); //���ȣ ���
               student.get(i).list(); //��ȿ� �ִ� ����Ʈ �Լ� ���
            }
            break; //break
         case 0: //0�Է½�
            System.out.println("����"); //���� ���
            break; //break
         default: //0~3�׿��Է½�
            System.out.println("�߸� �Է��ϼ̽��ϴ�."); //�߸��Է��ϼ̽��ϴ�. ���
            break; //break
         }

      } while (n != 0); //n != 0 �ݺ�

   }

}