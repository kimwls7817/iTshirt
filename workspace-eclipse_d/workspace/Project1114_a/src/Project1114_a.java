
public class Project1114_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.printf("%x\n",aa.hashCode());	//75a1cd57
		System.out.println(aa);	//패키지.클래스명@해쉬코드 = A@75a1cd57
//		System.out.println(aa.toString());
		
		B bb = new B();
		System.out.println(bb.toString()); 	//필드값: a=3, b=4
		System.out.println(bb);
	}

}
