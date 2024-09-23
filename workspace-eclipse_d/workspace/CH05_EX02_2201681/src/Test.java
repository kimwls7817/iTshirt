
public class Test {
	public static void main(String[] args) {
		//1차원 배열 생성 3가지 방법
		
		//a --> [1.1, 2.2, 3.3]
		//#방법1
		double[] a = new double[3];
		a[0]=1.1;
		a[1]=2.2;
		a[3]=3.3;
		//선언과 값의 대입 분리
		double[] a1;
		a1 = new double[3];
		
		//#방법2
		double[] b = new double[] {1.1, 2.2, 3.3};
		//선언과 값의 대입 분리
		double[] b1;
		b1 = new double[] {1.1, 2.2, 3.3};
		
		//#방법3
		double[] c = {1.1, 2.2, 3.3};
		//선언과 값의 대입 분리 --> 불가능
		//double[] c1;
		//c1 = {1.1, 2.2, 3.3};
	}
}
