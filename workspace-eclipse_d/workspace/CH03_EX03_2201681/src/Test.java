
public class Test {
	public static void main(String[] args) {
		//비교연산자
		int a = 3;
		System.out.println(a>3); //false
		System.out.println(a>=3);  //true
		System.out.println(a<3);  //false
		System.out.println(a<=3);  //true
		System.out.println(a==3);  //true
		System.out.println(a!=3);  //false
		
		System.out.println(a=5);  //5
		
		//논리연산자
		System.out.println(true && true);  //true
		System.out.println(true || (3<2));  //true
		System.out.println(!(5>=2) ^ (7>2));  //true
		System.out.println(false || (4<=4));  //true
	}
}
