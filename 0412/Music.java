import java.util.Scanner;

public class Music {
   String song; //�뷡
   String singer; //����
   public Music(String song, String singer) { //Music ������
      this.song = song;
      this.singer = singer;
   }  //������ �޼ҵ�
   public String getsong() {
      return song;   
   }
   public String getsinger() {
      return singer;
   }
   public void result ()  { //���� ���
      System.out.println("�뷡�̸�:"+getsong()+" ����:"+ getsinger());
   }
}
