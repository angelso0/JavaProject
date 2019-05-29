import java.util.Scanner;

public class Music {
   String song; //노래
   String singer; //가수
   public Music(String song, String singer) { //Music 생성자
      this.song = song;
      this.singer = singer;
   }  //접근자 메소드
   public String getsong() {
      return song;   
   }
   public String getsinger() {
      return singer;
   }
   public void result ()  { //연산 결과
      System.out.println("노래이름:"+getsong()+" 가수:"+ getsinger());
   }
}
