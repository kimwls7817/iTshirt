//생성자 오버로딩
class A{
	A(){
		System.out.println("첫번째 생성자");
	}
	A(int a){
		System.out.println("두번째 생성자");
	}
	A(double a){
		System.out.println("세번째 생성자");
	}
	A(int a, double b){
		System.out.println("네번째 생성자");
	}
	A(String a){
		System.out.println("다섯번째 생성자");
	}
}



public class Test {
	public static void main(String[] args) {
		//#객체생성
		A a1 = new A();
		A a2 = new A(2);
		A a3 = new A(2.3);
		A a4 = new A(2, 2.3);
		
		A a5 = new A("안녕");
	}
}
