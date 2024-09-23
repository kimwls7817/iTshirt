class A {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}
class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Project1017_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A 타입 / A 생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		// B 타입 / B 생성자
		B bb = new B();
		System.out.println(bb.m);	// 3
		System.out.println(bb.n);	// 4
		bb.abc();	// A~~
		bb.bcd();	// b~~
		
		// A 타입 / B 생성자 : 다형적 표현
		A ab = new B();		// upcasting
		System.out.println(ab.m);	//3
		System.out.println(ab.m);
		ab.abc();
	}

}
