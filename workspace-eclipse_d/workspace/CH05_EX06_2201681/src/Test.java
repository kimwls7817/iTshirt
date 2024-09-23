
public class Test {
	public static void main(String[] args) {
		//(비정방행렬:3가지, 기말에 나올 예정)
		//2차원 비정방행렬 생성 및 초기화 방법 3가지
//		1  2
//		3          (길이가 한 개짜리 배열)
//		4  5  6
		
		//#방법 1
		int[][] a = new int[3][];
		a[0] = new int[] {1,2};
		a[1] = new int[] {3};
		a[2] = new int[] {4,5,6};
		
		//#방법 2
		int[][] b = new int[][] {{1,2}, {3}, {4,5,6}};
		
		//#방법 3
		int[][] c = {{1,2}, {3}, {4,5,6}};
	}
}
