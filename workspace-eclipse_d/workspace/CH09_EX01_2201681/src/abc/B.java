package abc;

public class B {
	void bcd() {
		//#객체 생성
		A a = new A();
		//#멤버 사용
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);  //오류
		//private 접근 지정자는 다른 클래스에서 사용 불가능
	}
}
