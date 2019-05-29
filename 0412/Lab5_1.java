import java.util.Scanner;
public class Lab5_1 { 
    public static void main(String[] args) {
       int a = 1; //배열은 무조건 있어야함 0안됨
       int f = 0; //f=finish
       int s = 0; //추가개수
       int i = 0; //추가된노래개수
       String Menu; //메뉴선택 변수
             
       Music [] Music = new Music [a];

          System.out.println
                ("=============="
                + "\n학번: 201804014"
                + "\n이름: 박소영"
                + "\n=============="
                + "Music player");
         
          Scanner sy = new Scanner(System.in);
          
    do{
        System.out.println();
        System.out.println("1. 음악리스트보기, 2. 음악리스트만들기, 0. 끝내기"); //메뉴
        f = sy.nextInt();
        
        
        switch (f) { 
        case 1:
        	if (Music[0]==null) {
        		System.out.println("음악이 없습니다."); //저장된 음악없으면 뜨게함
        	}
        	else {
            for (i=0; i<s; i++) {
            Music[i].result();
            	}
            }
        	break;
        	
        case 2:
        	System.out.println("추가할 음악의 개수: ");
        	s = sy.nextInt();
        	Music = new Music [s]; //객체 배열
               System.out.println("음악추가");
               sy.nextLine();
            for (i=0; i<s; i++) {
            	System.out.println((i+1)+".노래제목 :");
            	String song = sy.nextLine();
            	System.out.println((i+1)+".가수 :");
            	String singer = sy.nextLine();
                Music[i] = new Music(song, singer);
            }
        	break;
        	
        case 0:
        	break; //스위치케이스문 나감
        	
        default:
            System.out.println("잘못입력하셨습니다."); //1,2,0 제외 숫자 오류로 처리
            break;
        }
       }while(f != 0);
    	System.out.println("시스템 종료"); //시스템종료
    }
}