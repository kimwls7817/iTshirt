
public class Project1107_a_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();	//upcasting	//변수타입은 왼쪽의 왼쪽을 기준으로 봐야함.
		
		//인스턴스 필드
		System.out.println(aa.m);	//3
		System.out.println(bb.m);	//4
		System.out.println(ab.m);	//3(인스턴스 필드는 오버라이딩 불가.)
	}

}
