package Lab6_1;
class SingRobot extends Robot { // 자식 클래스
	public SingRobot() { // 기본 생성자
		super("노래로봇", 500);
	}

	public String toString() { // 기능 출력
		return "노래를 부른다";
	}
}