package Lab6_1;
class DanceRobot extends Robot { // 자식 클래스
	public DanceRobot() { // 기본 생성자
		super("댄스로봇", 300);
	}

	public String toString() { // 기능 출력
		return "춤을 춘다";
	}
}