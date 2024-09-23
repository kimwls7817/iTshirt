
public class B extends A{
	B() {
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a) {
		System.out.println("B 생성자 2");
	}
}
