class A {
	int m=3;
	void abc () {
		System.out.println("abc()메서드");
	}
	int bcd(int a) { 
		a=a*2;
		return a;
	}
}
public class Test {
	public static void main(String[] args) {
		//#1.객체생성
		A a = new A ();
		//#2.멤버호출
		System.out.println(a.m); //그냥 m만 쓰면 오류. 클래스 이름 포함시켜야 함.
		a.abc();
		int k = a.bcd(3);
		System.out.println(k); //6
	}
}
