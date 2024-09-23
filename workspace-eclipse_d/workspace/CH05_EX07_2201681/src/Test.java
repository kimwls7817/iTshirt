
public class Test {
	public static void main(String[] args) {
		//(a[i].length를 사용하는 이유가 가장 중요함.)
		//2차원 배열의 원소 출력
//		1  2  3
//		4  5
//		6  7  8  9
		
		int[][] a = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		//일반 for문을 사용 (length 사용)
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		//for each 구문을 사용
		for (int[] m:a) {
			for(int k: m) {
				System.out.println(k);
			}
		}
	}
}
