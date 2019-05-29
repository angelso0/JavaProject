package Lab6_1;
class Robot {

	String name;
	int price;

	public Robot(String name, int price) { //이름, 가격
		this.name = name;
		this.price = price;
	}

	public void info(Robot robot) {
		System.out.println("로봇 이름:" + name); //로봇 이름 출력
		System.out.println("가격:" + price); //로봇 가격 출력
		System.out.println("기능:" + robot.toString()); //로봇 기능 출력

	}
}

