class A {
	void abc() {
		System.out.println("오버로딩1");
	}
	void abc(int a) {
		System.out.println("오버로딩2");
	}
	void abc(int a, int b) {
		System.out.println("오버로딩3");
	}
	void abc(double a) {
		System.out.println("오버로딩4");
	}
	void abc(double a, double b) {
		System.out.println("오버로딩5");
	}
}
//매개변수의 리턴타입이나 이름을 바꾸는 것은 의미가 없음.

public class Test {
	//#1.객체 생성
	A a = new A();
	//#2.멤버 호출
	a.abc();
	a.abc(3);
	a.abc(1,2);
	a.abc(5.8);
	a.abc(1.1, 2.2);
}
