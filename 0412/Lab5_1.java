import java.util.Scanner;
public class Lab5_1 { 
    public static void main(String[] args) {
       int a = 1; //�迭�� ������ �־���� 0�ȵ�
       int f = 0; //f=finish
       int s = 0; //�߰�����
       int i = 0; //�߰��ȳ뷡����
       String Menu; //�޴����� ����
             
       Music [] Music = new Music [a];

          System.out.println
                ("=============="
                + "\n�й�: 201804014"
                + "\n�̸�: �ڼҿ�"
                + "\n=============="
                + "Music player");
         
          Scanner sy = new Scanner(System.in);
          
    do{
        System.out.println();
        System.out.println("1. ���Ǹ���Ʈ����, 2. ���Ǹ���Ʈ�����, 0. ������"); //�޴�
        f = sy.nextInt();
        
        
        switch (f) { 
        case 1:
        	if (Music[0]==null) {
        		System.out.println("������ �����ϴ�."); //����� ���Ǿ����� �߰���
        	}
        	else {
            for (i=0; i<s; i++) {
            Music[i].result();
            	}
            }
        	break;
        	
        case 2:
        	System.out.println("�߰��� ������ ����: ");
        	s = sy.nextInt();
        	Music = new Music [s]; //��ü �迭
               System.out.println("�����߰�");
               sy.nextLine();
            for (i=0; i<s; i++) {
            	System.out.println((i+1)+".�뷡���� :");
            	String song = sy.nextLine();
            	System.out.println((i+1)+".���� :");
            	String singer = sy.nextLine();
                Music[i] = new Music(song, singer);
            }
        	break;
        	
        case 0:
        	break; //����ġ���̽��� ����
        	
        default:
            System.out.println("�߸��Է��ϼ̽��ϴ�."); //1,2,0 ���� ���� ������ ó��
            break;
        }
       }while(f != 0);
    	System.out.println("�ý��� ����"); //�ý�������
    }
}