//package, import, class
		class A{
			int m=3;
			int n=5;
			void print() {
				System.out.println(m);
				System.out.println(n);
			}
		}
public class Test {
	//필드, 메서드, 생성자, 이너클래스
	public static void main(String[] args) {
		//#1. 객체생성
		A a1 = new A();
		A a2 = new A();
		
		//#2. 필드사용 (필드에 값을 쓰거나 읽는 것)
		System.out.println(a1.m); //3
		System.out.println(a1.n); //5
		System.out.println(a2.m); //3
		System.out.println(a2.n); //5
		a1.m = 10;
		a1.n = 20;
		a2.m = 30;
		a2.n = 40;
		
		//#3. 메서드사용(메서드를 호출)
		a1.print();
		a2.print();
	}		
}
