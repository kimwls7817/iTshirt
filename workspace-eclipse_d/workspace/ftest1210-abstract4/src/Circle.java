
// Shape 클래스를 상속받아 원을 나타내는 Circle 클래스
public class Circle extends Shape {
	private int radius;
	
	// draw 메서드를 오버라이딩하여 원을 그리는 동작을 구현
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}
