// Car = 필드(특징) + 메서드(기능, 동작)
public class Car {
	int price;
	String color;
	static int count;
	
	//생성자 오버로딩(생성자를 여러 개 설정)
	Car(){ count++; };    //default 생성자(자동으로 생성) => 안써도 됨.(JVM이 자동으로 생성.)
	//몇 개 만들었지?를 생성자 안에 두면 자동차를 한 대 만들 때마다 count가 자동적으로 증가됨.
	Car(int price) { count++; }; //가격 또는 옵션이 들어있는 차.
	
	void volUp() { 
		System.out.println("volume Up"); 
	}
	static void openDoor() {
		System.out.println("open Door");
	}
}
