class Circle{
	static double radius;
	final double PI  = 3.14159; //���� ��
	private int Circle = 0; //circle �ʱ�ȭ
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius(double radius) {
		return radius; //��ȯ��
	}
	
	public void setRadius(double radius) {
		this.radius = radius; //����
	}
	
	public double area() {
		return PI*radius*radius; //���� ���
	}		
	public void showCircle() {
		System.out.println(area()); //area()���� ���� ���̰� ���
	}
}
