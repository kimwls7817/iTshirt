package Cosmetics;

import java.util.Scanner;

import User.User;

public class CosmeticsOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필드로 Bright, Color, Texture, Moisture
		// order("000님이 주문하신 ~ 제품 얼마 입니다.")
		// "주문해주셔서 감사합니다. 다음날 (가능하면 날짜 +1)오후에 받아보실 수 있습니다."
		
		Scanner sc = new Scanner(System.in);
		Order[] list = new Order[10];	//User 타입의 배열 생성
		boolean cnd = true;	//반복
		
		String bright;
		
		do {
			System.out.println("--------------------------------------");
			System.out.println(" ");
			System.out.println("1. 밝기(Bright)");
			System.out.println("2. 색상(Color)");
			System.out.println("3. 질감(Texture)");
			System.out.println("4. 제형(Moisture)");
			System.out.println("5. 완료(Finish)");
			System.out.println(" ");
			System.out.println("--------------------------------------");
			
			
			//1. 밝기(Bright)
			System.out.println(" ");
			System.out.println("1. 당신의 밝기를 선택하세요(Choose your brightness)");
			System.out.println("| 13호 | 15호 | 17호 | 19호 | 20호 | 21호 | 23호 | 25호 | 27호 |");
			System.out.println(" ");
			System.out.print("몇호를 사용하시나요?: ");
			bright = sc.next();	//밝기 입력
			System.out.println(" ");
			
			System.out.println("--------------------------------------");
			System.out.print("수정하실 항목의 번호를 입력하세요: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:	//밝기(Bright)
				System.out.println(" ");
				System.out.println("| 13호 | 15호 | 17호 | 19호 | 20호 | 21호 | 23호 | 25호 | 27호 |");
				System.out.println(" ");
				System.out.print("몇호를 사용하시나요?: ");
				bright = sc.next();	//밝기 입력
				System.out.println(" ");
				
			case 5:
				cnd = false;
				break;
			default:
				System.out.println(" ");
				System.out.println("다시 입력하세요.");
				System.out.println(" ");
				break;
			}
		}while(cnd);
		System.out.println(" ");
		System.out.println("주문해주셔서 감사합니다. 상품은 다음날 오후에 받아보실 수 있습니다. ");
	}

}