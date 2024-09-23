
public class Project1107_e_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A 객체 생성
		A aa1 = new A();	//A 생성자 2, A 생성자 1
		System.out.println();
		A aa2 = new A(3);	//A 생성자 2
		System.out.println();
		
		//B 객체 생성
		B bb1 = new B();	//A 생성자 1, B 생성자 2, B 생성자 1
		System.out.println();
		B bb2 = new B(3);	//A 생성자 2, A 생성자 1, B 생성자 2
	}

}
