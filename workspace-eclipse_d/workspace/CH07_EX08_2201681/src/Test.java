// 생성자
class A{
	int m;
	void abc() {
		System.out.println("클래스 A의 메서드");
	}	
//	A(){ 컴파일러가 추가해주는 생성자 (기본생성자)
//		
//	}
}

class B{
	int m;
	void abc() {
		System.out.println("클래스 A의 메서드");
	}	
	B() {
		
	}
}
class C{
	int m;
	void abc() {
		System.out.println("클래스 A의 메서드");
	}	
	C(int a){
		System.out.println(a);
	}
}

public class Test {
	public static void main(String[] args) {
		//#1. 객체생성
		A a = new A();
		System.out.println(a.m);
		a.abc();
		
		//#2. 객체생성
		B b = new B();		
		
		//#3. 객체생성
//		C c = new C();//기본생성자가 없어서 오류
		C c = new C(3);
		System.out.println(c.m);
		c.abc();
		
		
	}
}
