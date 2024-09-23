package practice2_2201681;

import java.util.Scanner;

public class practice2_4_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램
		// if-else문 이용
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
				
		System.out.println("첫째 숫자: ");
		num1 = input.nextInt();
		System.out.println("둘째 숫자: ");
		num2 = input.nextInt();
		System.out.println("세째 숫자: ");
		num3 = input.nextInt();
		// nextInt() : 정수입력받는 메소드
				
		int max = num1;
		if (num1 < num2) {
			max = num2;
			if (num2 < num3) 
				max = num3;
				else {max = num2;}
		} else {
			if (num1 < num3) 
				max = num3;
						
		}
		System.out.println("제일 큰 수: " + max);
	}

}
