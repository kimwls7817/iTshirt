package practice2_2201681;

public class practice2_2_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지 정수 중 3 또는 4의 배수의 합.
		int sum = 0;
		
		for( int i=0; i<=100; i++) {
			if(i%3==0 || i%4==0)
				sum += i;
			else continue;
		}
		
		System.out.println("3의 배수와 4의 배수의 합은" + sum + "입니다.");
		
	}

}
