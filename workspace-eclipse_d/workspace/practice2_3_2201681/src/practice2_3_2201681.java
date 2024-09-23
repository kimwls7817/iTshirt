import java.util.Scanner;

public class practice2_3_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;	// 연산자
		double num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연산자 입력 : ");
		a = scan.nextLine();
		
		System.out.println("숫자1, 숫자2 입력 : ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		if (a.equals("+")) {    // 같다
			System.out.println(num1 + num2);
		}else if (a.equals("-")) {    // -
			System.out.println(num1 - num2);
		}else if (a.equals("*")) {     // *
			System.out.println(num1 * num2);
		}else {     // /
			System.out.println(num1 / num2);
		}
			
	}

}
