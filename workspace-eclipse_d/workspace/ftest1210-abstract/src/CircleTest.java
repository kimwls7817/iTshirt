// Circle 클래스를 테스트하는 클래스
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(10);
		
		// 원의 중심 좌표와 면적 출력
		System.out.println("원의 중심: (" + obj.x + ", " + obj.y + ")");
		System.out.println("원의 면적: " + obj.calcArea());
	}

}
