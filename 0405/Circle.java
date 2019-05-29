class Circle{
	static double radius;
	final double PI  = 3.14159; //파이 값
	private int Circle = 0; //circle 초기화
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius(double radius) {
		return radius; //반환값
	}
	
	public void setRadius(double radius) {
		this.radius = radius; //실행
	}
	
	public double area() {
		return PI*radius*radius; //넓이 계산
	}		
	public void showCircle() {
		System.out.println(area()); //area()에서 계산된 넓이값 출력
	}
}
