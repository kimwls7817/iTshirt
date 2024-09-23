package bcd;

public class C {
	void cde() {
		//#객체 생성
		abc.A a = new abc.A();
		//#멤버 사용
		//다른 패키지에서는 자식 클래스가 아닌 경우 public만 사용 가능
		System.out.println(a.a); 
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
