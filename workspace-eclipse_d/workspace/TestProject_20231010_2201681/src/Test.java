
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 10;
//		double d = 3.1415;
//		String str = "kim";
//		System.out.printf("num: %d", num);
//		System.out.printf("\n d: %.2f", d);    //소수점 두자리까지 표시
//		System.out.printf("\n s: %10s", str);    //10자리를 확보한 후 출력. 자리수 맟출 때 사용.
		A a = new A();
		System.out.println(a.m);    //3 non-static
		System.out.println(A.n);    //5 static 멤버
	}

}
