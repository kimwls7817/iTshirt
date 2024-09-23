
public class Test {
	public static void main (String [] ar) {
		//업캐스팅(up casting)
		long a = 10;
		double b = 3.5F;
		float c = 3;
		
		//다운캐스팅(down casting)
		int d = (int)2.8;
		float e = (float)5.9;
		short f = (short)2.3;
		byte g = (byte)130;
		
		System.out.println(a);  //10
		System.out.println(b);  //3.5
		System.out.println(c);  //3.0
		System.out.println(d);  //2
		System.out.println(e);  //5.9
		System.out.println(f);  //2
		System.out.println(g);  //130
	}
}
