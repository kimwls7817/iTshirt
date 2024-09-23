//추상 클래스를 상속받는 자식 클래스에서는 반드시 추상 메소드를 재정의해야 함.
//추상 클래스로는 객체 생성 불가능.
//추상 메소드가 아닌 일반 메소드도 선언 가능.

// Animal 클래스를 상속받아 사자를 나타내는 Lion 클래스
public class Lion extends Animal {
	// move 메서드를 오버라이딩하여 사자의 움직임을 출력
	public void move() {
		System.out.println("사자의 move() 메소드입니다. ");
	}
}
