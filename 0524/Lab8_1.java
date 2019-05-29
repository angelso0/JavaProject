import java.util.ArrayList; //arrylist 불러옴
import java.util.Scanner; // scanner 불러옴

class Student { //클래스
   String name; //이름 선언
   String dept; //학과 선언
   int grade; //학년 선언

   public Student(String name, String dept, int grade) { //Scanner로 받은 변수
      this.name = name; //이름 전역변수선언
      this.dept = dept; //학과 전역변수선언
      this.grade = grade; //학년 전역변수선언
   }
   public void list() { //이름,학과,학년 순으로 프린트
      System.out.println("이름 :"+name); //프린트와 이름받아줌
      System.out.println("학과 :"+dept); //프린트와 이름받아줌
      System.out.println("학년:"+grade); //프린트와 이름받아줌
   }
}

public class Lab8_1 { //메인
   public static void main(String[] args) { //메소드선언 메인
      // TODO Auto-generated method stub
	   
		System.out.println("=============" 
				+"\n학번: 201804014"
				+"\n이름: 박소영"																
				+"\n============="); //201804014박소영
	   
      ArrayList<Student> student = new ArrayList<Student>(); //객체불러옴
      Scanner kbd = new Scanner(System.in); //Scanner불러옴
      System.out.println(">>학생 관리 시스템<<"); //출력
      Student s =null; //객체 초기화
      int n = 0; //n초기화
      do { //do~while 문
         System.out.println("1.학생 등록  2.학생 삭제 3.학생 리스트 0.종료"); //리스트출력
         n = kbd.nextInt(); //리스트 번호 입력
         switch (n) { //0~1선택
         case 1: //1번 입력시
            System.out.println("이름 : "); //이름: 출력
            String name = kbd.next(); //name 입력
            System.out.println("학과:"); //학과: 출력
            String dept = kbd.next(); //dept 입력
            System.out.println("학년: "); //학년: 출력
            int grade = kbd.nextInt(); //grade 입력
            s= new Student(name,dept,grade); //학생 생성자 호출
            student.add(s); //추가
            break; //그만함 멈춤 break
         case 2: //2번 입력시
            for(int i = 0;  i<student.size();i++) {  //for문을 이용해서 방번호만큼 반복
               System.out.println("====="+(i+1)+"======="); //방번호 출력
               student.get(i).list(); //방안에 있는 리스트함수 출력
            }
            System.out.println("삭제할 학생번호:"); //삭제할 학생번호: 출력
            int num = kbd.nextInt(); //번호입력
            student.remove(num-1); //수에서 삭제한 학생 -1명
            break; //break
         case 3:  //3번 입력시
            for(int i = 0;  i<student.size();i++) { //for문을 이용해서 방번호만큼 반복
               System.out.println("====="+(i+1)+"======="); //방번호 출력
               student.get(i).list(); //방안에 있는 리스트 함수 출력
            }
            break; //break
         case 0: //0입력시
            System.out.println("종료"); //종료 출력
            break; //break
         default: //0~3그외입력시
            System.out.println("잘못 입력하셨습니다."); //잘못입력하셨습니다. 출력
            break; //break
         }

      } while (n != 0); //n != 0 반복

   }

}