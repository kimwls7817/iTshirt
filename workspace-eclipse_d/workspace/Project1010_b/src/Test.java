//클래스 = 필드 + 메서드 (반드시 객체를 생성해야 함.)
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스이름 변수 = new 생성자이름(=클래스이름)();
		//클래스는 무조건 대문자.
		Car c1 = new Car();
		Car c2 = new Car(1000);
		
		System.out.println("자동차 생산대수: " + Car.count );
		
		// c1 객체가 volUp() 실행
		// volUp()은 non-static이르서 객체를 만들어야함.
		c1.volUp();
		
		// c2 객체가 openDoor() 실행
		c2.openDoor();
		
		//이름 출력
		print_name();
		//static안에서 호출하려면 print_name도 static멤버 안에 있어야 한다.
		
		//나이 출력(non-static)
		Test t1 = new Test();     //클래스 이름이 Test니까.
		t1.print_age();
	}

	//이름 출력 메소드: print_name()
	public static void print_name() {
		System.out.println("김예진");
	}
	
	//나이 출력 메소드(non-static): print_age() 
	public void print_age() {
		System.out.println("21살");
	}
}
