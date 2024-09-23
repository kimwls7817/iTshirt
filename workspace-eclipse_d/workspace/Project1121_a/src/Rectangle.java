
public class Rectangle extends Shape{
	private int width, height;	//필드 선언
	@Override	//추상클래스를 상속할때는 반드시 추상 메소드를 오버라이딩한다.
	public void draw() {	//추상메소드 구현
		System.out.println("사각형 그리기");
	}
	void move() {
		
	}
}