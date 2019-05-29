package Lab6_1;
class DrawRobot extends Robot { // 자식클래스
	public DrawRobot() { // 기본 생성자
		super("그림로봇", 350);
	}

	public String toString() { // 기능 출력
		return "그림을 그린다"; 
	}
}