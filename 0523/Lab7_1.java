
public class Lab7_1 {
	public static String delChar(String str1, String str2) {
		String S = "";
		StringBuffer sw = new StringBuffer();
		
		for(int i=0;i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i))==-1) { //indexOf�� �������� �ʿ��� ���� ����������
				sw.append(str1.charAt(i)); //���ϴ°� �߰�
			}
		}
		S = sw.toString();
		return S;
		
	}
	
	public static void main(String[] args) {
		System.out.println("============="
				+"\n�й�: 201804014"
				+"\n�̸�: �ڼҿ�"																
				+"\n=============");
		
		System.out.println("(��@��! 5���̱���~)->"+delChar("(��@��!5���̱���~)","(@!~)"));							
		System.out.println("(2.0.1.9 �� \t5 �� , 17 �� )"+"->"+delChar("(2 0 1 9 �� \t5 �� , 17 �� )"," ,.\t"));
	}
}

