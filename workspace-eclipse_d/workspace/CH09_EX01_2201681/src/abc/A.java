package abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;
	
	void abc() {  //자신의 필드는 모든 접근 지정자 사용 가능
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
