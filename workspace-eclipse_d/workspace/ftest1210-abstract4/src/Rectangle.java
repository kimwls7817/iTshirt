// Shape 클래스를 상속받아 사각형을 나타내는 Rectangle 클래스
public class Rectangle extends Shape {
	private int width, height;
	
	// draw 메서드를 오버라이딩하여 사각형을 그리는 동작을 구현
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}
