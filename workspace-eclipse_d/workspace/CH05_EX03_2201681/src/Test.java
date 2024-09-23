
public class Test {
	public static void main(String[] args) {
		//기본자료셩 vs 참조자료형
		int a=3;
		int b=a;
		b=5;
		System.out.println(a); //3
		System.out.println(b); //5
		
		//
		int[] c = {1,2,3};
		int[] d=c;
		d[0]=5;
		c[1]=6;
		c[2]=7;
		System.out.println(c[0]); //5
		System.out.println(c[1]); //6
		System.out.println(c[2]); //7
		System.out.println(d[0]); //5
		System.out.println(d[1]); //6
		System.out.println(d[2]); //7
	}
}
