//내부 구성요소(필드)
//필드 vs 지역변수

class A{
	int m=3;
	int n=5;
	void print() {
		int k=7; //k값은 stack메모리여서 초기화 후 실행하면 오류.
		System.out.println(m);
		System.out.println(n);
		System.out.println(k);
	}
}

public class Test {
	public static void main(String[] args) {
		//#1.객체생성
		A a = new A();
		//#2.메서드 호출
		a.print();
	}
}
