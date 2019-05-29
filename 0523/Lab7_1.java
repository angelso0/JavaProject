
public class Lab7_1 {
	public static String delChar(String str1, String str2) {
		String S = "";
		StringBuffer sw = new StringBuffer();
		
		for(int i=0;i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i))==-1) { //indexOf가 대조역할 필요한 글자 얻을수있음
				sw.append(str1.charAt(i)); //원하는값 추가
			}
		}
		S = sw.toString();
		return S;
		
	}
	
	public static void main(String[] args) {
		System.out.println("============="
				+"\n학번: 201804014"
				+"\n이름: 박소영"																
				+"\n=============");
		
		System.out.println("(벌@써! 5월이구나~)->"+delChar("(벌@써!5월이구나~)","(@!~)"));							
		System.out.println("(2.0.1.9 년 \t5 월 , 17 일 )"+"->"+delChar("(2 0 1 9 년 \t5 월 , 17 일 )"," ,.\t"));
	}
}

