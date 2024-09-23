//외부클래스의 멤버 사용하기

class A {
	int m=3;
	void abc () {
		System.out.println("abc()메서드");
		System.out.println(m); //같은 클래스 내부에서는 클래스 명을 포함해야 할 필요 없음.
	}
	int bcd(int a) { 
		abc();
		a=a*2;
		return a;
	}
}

public class Test {
	public static void main(String[] args) {
		//#1.객체 생성
		A a = new A ();
		a.bcd(3);
		
	}
}
