package bcd;
import abc.A

public class D extends A{
	void def() {
		System.out.println(a);
		//다른 패키지라도 자식클래스는 protected 사용 가능
		System.out.println(b);
//		System.out.println(c); //오류
//		System.out.println(d); //오류
	}
}
