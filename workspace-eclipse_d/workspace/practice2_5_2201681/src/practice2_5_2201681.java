import java.util.Scanner;
//ctrl + shift + o는 자동 import

public class practice2_5_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		키보드에서 영문자를 읽어서 자음인지 모음인지 구분. 대소문자 모두 처리 가능.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");

		String str = scan.next(); //단어입력

		while( !(str.equals("quit")) ) {	// 조건이 true 일때 반복(quit이 아닌 경우 반복)

			switch(str) {
			case "a":	case "e":	case "i":
			case "o":	case "u":	
			case "A":	case "E":	case "I":
			case "O":	case "U":
				System.out.println("모음");
				break;
			default:
				System.out.println("자음");
			}
			System.out.println("문자를 입력하세요: ");
			str = scan.next();	//
		}	//while
		System.out.println("프로그램 종료!!");
	}	// 자동 들여쓰기 ctrl+a(전체선택) -> ctrl+i(범위 내 들여쓰기)

}
