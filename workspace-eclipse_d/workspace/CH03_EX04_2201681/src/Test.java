
public class Test {
	public static void main(String[] args) {
		//비트연산자를 이용한 놀리연산
		int a=3, b=5, c=7;
		System.out.println(false & a++>3);  //false
		System.out.println(true | ++b>5);  //true
		System.out.println(false ^ c++>7);  //false
		System.out.println(a);  //4
		System.out.println(b);  //6
		System.out.println(c);  //8
		
		//논리연산자를 이용한 논리연산
		a=3, b=5, c=7;
		System.out.println(false && a++>3);  //false
		System.out.println(false && a++>3);  //false
	}
}
