// 원을 나타내는 Circle 클래스, Shape 클래스를 상속받음
public class Circle extends Shape{
	int radius;	// 원의 반지름
	
	// 생성자: 반지름을 받아 초기화하고, 좌표를 기본값으로 설정
	public Circle(int radius) {
		this.radius = radius;
		x=0;
		y=0;
	}
	
	// 원의 면적을 계산하는 메서드
	double calcArea() {
		return 3.14*radius*radius;
	}
}
