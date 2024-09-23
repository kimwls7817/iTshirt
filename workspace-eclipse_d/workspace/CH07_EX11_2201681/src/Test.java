//this() 메서드: 같은 클래스의 다른 생성자 호툴
class A{
	A(){
		this(1.2);
		System.out.println("1");
	}
	A(int a){
		this(2.3);
		System.out.println("2");
	}
	A(double b){
		System.out.println("3");
	}
	A(int a, int b){
		this(5.3);
		System.out.println("4");
	}
	A(int a, int b, int c){
		this(2);
		System.out.println("5");
	}
}
public class Test {
	public static void main(String[] args) {
		//#1.미션1. 3-2-5가 출력되도록 클래스를 수정
		A a = new A(1,2,3);
		A b = new A();  //3-4-1
	}
}
