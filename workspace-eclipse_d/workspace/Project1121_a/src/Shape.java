
public abstract class Shape {	//추상클래스 선언
	private int x, y;	//필드
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw();	//추상메소드
};
