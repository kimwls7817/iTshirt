
public class Test {
//	(String[] ar)이기 때문에 안에 숫자를 저장해도 문자로 저장되는 것임. string타입.
	public static void main(String[] ar) {
		System.out.println(ar.length);//0->4
		System.out.println(ar[0]);//abc
		System.out.println(ar[1]);//bcd
		System.out.println(ar[2]);//"2"
		System.out.println(ar[3]);//"3.4"
		
		System.out.println(ar[2]+1);//21
		System.out.println(ar[3]+2.1);//3.42.1
		
		//String -> 기본자료형
		//boolean, Byte, Short, Integer, Long, Float, Double, Character
		
		System.out.println(Integer.parseInt(ar[2])+1);//3
		System.out.println(Double.parseDouble(ar[3])+2.1);//5.5
	}
}
