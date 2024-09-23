
public class Test {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(a.length); 
		
		for(int i=0; i<7; i++) {
			System.out.println(a[i]);
		}
		//....100라인
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//....100라인
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//for-each 구문을 이용한 출력
		for(int k:a) {
			System.out.println(k);
		}
	}
}

