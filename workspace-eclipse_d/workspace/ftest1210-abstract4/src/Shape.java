// 도형을 나타내는 추상 클래스
public abstract class Shape {
	private int x,y;
	
	// 도형의 위치를 이동시키는 메서드
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	// 도형을 그리는 추상 메서드
	public abstract void draw();
}