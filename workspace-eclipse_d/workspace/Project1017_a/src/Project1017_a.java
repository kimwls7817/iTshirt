class A{}
class B extends A{}
class C extends B{}
class D extends C{}

public class Project1017_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # A
		A aa = new A();
		A ab = new B();		// upcasting
		A ac = new C();		// upcasting
		A ad = new D();		// upcasting
		
		// # B 
//		B ba = new A();		//오류
		B bb = new B();
		B bc = new C();		// upcasting
		B bd = new D();		// upcasting
		
		// # C
//		C ca = new A();		//오류
//		C cb = new B();		//오류
		C cc = new C();
		C cd = new D();		// upcasting
		
		// # D
//		D da = new A();		//오류
//		D db = new B();		//오류
//		D dc = new C();		//오류
		D dd = new D();
	}

}
