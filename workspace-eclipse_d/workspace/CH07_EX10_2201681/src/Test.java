//this 키워드
class A{
	int m=3;
	int n=5;
	void set(int a, int b) {
		m=a;
		n=b;
	}
}

class B{
	int m=3;
	int n=5;
	void set(int a, int b) {
		m=m;
		n =this.n; //자기자신으로 돌아감.
	}
}
public class Test {
	public static void main(String[] args) {
		//#객체 생성
		A a = new A();
		a.set(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);;
		a.set(2, 3);;
		System.out.println(a.m);
		System.out.println(a.n);
		
		//#객체생성
		B b = new B();
		System.out.println(b.m);
		System.out.println(b.n);
		b.set(2, 3);;
		System.out.println(b.m);
		System.out.println(b.n);
	}
}