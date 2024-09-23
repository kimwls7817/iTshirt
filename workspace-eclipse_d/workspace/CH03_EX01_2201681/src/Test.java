
public class Test {
	public static void main(String[] args) {
//		//산술연산자
//		System.out.println(7+4);
//		System.out.println(7-4);
//		System.out.println(7*4);
//		System.out.println(7/4);
//		System.out.println(7%4);
//		
//		//증감연산자
//		int a = 3;
//		int b = a++;
//		System.out.println(a); //3
//		System.out.println(b); //4
//		
//		a=3;
//		b=++a;
//		System.out.println(a); //4
//		System.out.println(b); //4
//		
//		a=3;
//		System.out.println(a++); //3 일단 3을 출력한 후, 다음 +1로 계산됨.
//		System.out.println(++a); //5 a에 +1 후 출력.
//		
		int a=3;
		int b=4;
		int c = a++ + ++b;
		System.out.println(a);  //3
		System.out.println(b);  //4
		System.out.println(c); //c=2+4(a는 증가 전, b는 증가 후.)
	}
}
