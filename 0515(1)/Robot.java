package Lab6_1;
class Robot {

	String name;
	int price;

	public Robot(String name, int price) { //�̸�, ����
		this.name = name;
		this.price = price;
	}

	public void info(Robot robot) {
		System.out.println("�κ� �̸�:" + name); //�κ� �̸� ���
		System.out.println("����:" + price); //�κ� ���� ���
		System.out.println("���:" + robot.toString()); //�κ� ��� ���

	}
}

