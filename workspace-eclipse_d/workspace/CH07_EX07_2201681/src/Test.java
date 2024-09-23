//가변길이 매개변수
class A {
	void abc() {
		System.out.println(0);
	}
	void abc(int a) {
		System.out.println(1);
	}
	void abc(int a, int b) {
		System.out.println(2);
	}
	void abc(int a, int b, int c) {
		System.out.println(3);
	}
	void abc(int a, int b, int c, int d) {
		System.out.println(4);
	}
}

class B {
	void abc(int... a) {
		System.out.println(a.length);
	}
}


public class Test {
	public static void main(String[] args) {
		//#1.객체생성
		A a = new A();
		//#2. 멤버호출
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		a.abc(1,2,3,4);
		
		//#1.객체생성
		B b = new B();
		//#2. 멤버호출
		b.abc();
		b.abc(1);
		b.abc(1,2);
		b.abc(1,2,3);
		b.abc(1,2,3,4);
	}
}
