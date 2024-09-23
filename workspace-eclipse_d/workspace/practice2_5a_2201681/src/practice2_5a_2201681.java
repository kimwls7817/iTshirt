import java.util.Scanner;

public class practice2_5a_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");

		String str = scan.next();
		
		while( !(str.equals("quit")) ) {	

			switch(str) {	//:대신 ->연산자 사용. 향상된 switch문
			case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" ->
				System.out.println("모음");
				// 향상된 switch문에서는 break를 사용하지 않음.
			default -> 
				System.out.println("자음");
			}
			
			System.out.println("문자를 입력하세요: ");
			str = scan.next();	//
		}	
		
		System.out.println("프로그램 종료!!");
	}

}
