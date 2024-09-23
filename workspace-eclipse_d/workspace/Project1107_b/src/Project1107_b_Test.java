
public class Project1107_b_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스명으로 바로 접근
		System.out.println(A.m);	//3
		System.out.println(B.m);	//4
		System.out.println();
		
		//객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		//생성한 객체로 정적 필드 호출
		System.out.println(aa.m);	//3
		System.out.println(bb.m);	//4
		System.out.println(ab.m);	//3 : static 필드는 오버라이딩 불가.
	}

}
