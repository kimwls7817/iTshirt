
public class Test {
	public static void main(String [] ar) {
		//변수의 생명주기(a가 사라진 줄, b가 사라진 줄.)ㅁㅁ
		int a=3;
		{
			a=8;
			int b=5;
			b=9;
			System.out.println(a);  //8
			System.out.println(b);  //9
		}
		System.out.println(a);  //3-->8
//		System.out.println(b);  //X
	}
}
