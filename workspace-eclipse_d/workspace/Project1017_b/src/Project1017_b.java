class A{}
class B extends A{}
class C extends B{}

public class Project1017_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
//		B b = new a;	// 오류-자식이 부모를 가리킴.
//		B b = (B) a;	// 오류 없애는 방법. a를 B타입으로 바꿈. downcasting.
		
//		A a = new B();	// upcasting.
		
//		B b = a;		//오류
		B b = (B)a;		// downcasting.
		
//		C c = a;		//오류
		C c = (C)a;		// downcasting.
	}

}
