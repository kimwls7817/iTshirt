
public class Test {
	public static void main(String[] args) {
		int a=5;
		abc(a);
		System.out.println(a); //???
		
		int[] b= {1,2,3};
		bcd(b);
		System.out.println(b); //???
	}
	
	void abc(int a) {
		a=a+2;
	}
	
	void bcd(int[] a) {
		a[0]=4;
		a[1]=5;
		a[2]=6;
	}
}
