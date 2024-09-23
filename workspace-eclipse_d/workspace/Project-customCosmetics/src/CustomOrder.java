import java.util.Scanner;

public class CustomOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필드로 Bright, Color, Texture, Moisture
		
		Scanner sc = new Scanner(System.in);
		User[] list_u = new User[10];
		Order[] list_o = new Order[10];	//User 타입의 배열 생성
		boolean cnd = true;	//반복
		
		int bright, color, texture, moisture, price;
		String b, c, t, m, p;
		boolean repeatSwitch = true;
		int i = 0;
		
		do {
			
			System.out.println("--------------------------------------");
			System.out.println(" ");
			System.out.println("1. 밝기(Bright)");
			System.out.println("2. 색상(Color)");
			System.out.println("3. 제형(Texture)");
			System.out.println("4. 수분감(Moisture)");
			System.out.println("5. 완료(Finish)");
			System.out.println(" ");
			System.out.println("--------------------------------------");

			
			//1. 밝기(Bright)
			System.out.println(" ");
			System.out.println("1. 당신의 밝기를 선택하세요(Choose your brightness). ");
			System.out.println("| 13호 = 1 |");
			System.out.println("| 15호 = 2 |");
			System.out.println("| 17호 = 3 |");
			System.out.println("| 19호 = 4 |");
			System.out.println("| 21호 = 5 |");
			System.out.println("| 23호 = 6 |");
			System.out.println("| 25호 = 7 |");
			System.out.println("| 27호 = 8 |");
			System.out.println(" ");
			System.out.print("몇호를 사용하시나요?: ");
			bright = sc.nextInt();	//밝기 입력
			System.out.println(" ");
			// 입력받은 값을 밝기 호수로 저장하기
			if (bright == 1) {
	            b = "13호";
	        } else if (bright == 2) {
	            b = "15호";
	        } else if (bright == 3) {
	            b = "17호";
	        } else if (bright == 4) {
	            b = "19호";
	        } else if (bright == 5) {
	            b = "21호";
	        } else if (bright == 6) {
	            b = "23호";
	        } else if (bright == 7) {
	            b = "25호";
	        } else if (bright == 8) {
	            b = "27호";
	        } else {
	            b = "잘못 입력하셨습니다. 다시 입력해주세요.";
	            System.out.print("몇호를 사용하시나요?: ");
				bright = sc.nextInt();	//밝기 입력
	        }
			System.out.println(b + "를 선택하셨습니다. ");
			System.out.println(" ");
			System.out.println("--------------------------------------");
			
			
			//2. 색상(Color)
			System.out.println(" ");
			System.out.println("2. 당신의 색상을 선택하세요(Choose your color). ");
			System.out.println("| 옐로우베이스 아이보리(yellow ivory) = 1 |");
			System.out.println("| 핑크베이스 아이보리(pink ivory) = 2 |");
			System.out.println(" ");
			System.out.print("어떤 색상을 사용하시나요?: ");
			color = sc.nextInt();	//색상 입력
			System.out.println(" ");
			// 입력받은 값을 색상으로 저장하기
			if (color == 1) {
				c = "옐로우베이스 아이보리(yellow ivory)";
			}else if (color == 2) {
				c = "핑크베이스 아이보리(pink ivory)";
			}else {
	            c = "잘못 입력하셨습니다. 다시 입력해주세요.";
	            System.out.print("어떤 색상을 사용하시나요?: ");
				color = sc.nextInt();	//색상 입력
	        }
			System.out.println(c + "를 선택하셨습니다. ");
			System.out.println(" ");
			System.out.println("--------------------------------------");
			
			
			//3. 제형(Texture)
			System.out.println(" ");
			System.out.println("3. 당신의 제형을 선택하세요(Choose your texture). ");
			System.out.println("| 팩트(35g) = 1 |  (18000원=기본가격)");
			System.out.println("| 파운데이션(120g) = 2 |  (+15000원)");
			System.out.println("| 파우더(30g) = 3 |  (-5000원)");
			System.out.println("| 크림(60g) = 4 |  (+20000원)");
			System.out.println("| 스틱(20g) = 5 |  (+5000원)");
			System.out.println(" ");
			System.out.print("어떤 제형을 사용하시나요?: ");
			texture = sc.nextInt();	//제형 입력
			System.out.println(" ");
			// 입력받은 값을 제형으로 저장하기
			if (texture == 1) {
				t = "쿠션(35g)";
			}else if (texture == 2) {
				t = "파운데이션(120g)";
			}else if (texture == 3) {
				t = "파우더(30g)";
			}else if (texture == 4) {
				t = "크림(60g)";
			}else if (texture == 5) {
				t = "스틱(20g)";
			}else {
	            t = "잘못 입력하셨습니다. 다시 입력해주세요.";
	            System.out.print("어떤 색상을 사용하시나요?: ");
	            texture = sc.nextInt();	//제형입력
	        }
			System.out.println(t + "를 선택하셨습니다. ");
			System.out.println(" ");
			System.out.println("--------------------------------------");
			
			
			//4. 수분감(Moisture)
			System.out.println(" ");
			System.out.println("4. 당신의 수분감을 선택하세요(Choose your moisture). ");
			System.out.println("| 매트(matte type) = 1 |");
			System.out.println("| 세미매트(semi matte type) = 2 |");
			System.out.println("| 광택(glossy) = 3 |");
			System.out.println(" ");
			System.out.print("어떤 수분감을 사용하시나요?: ");
			moisture = sc.nextInt();	//수분감 입력
			System.out.println(" ");
			// 입력받은 값을 수분감으로 저장하기
			if (moisture == 1) {
				m = "매트(matte type)";
			}else if (moisture == 2) {
				m = "세미매트(semi matte type)";
			}else if (moisture == 3) {
				m = "광택(glossy)";
			}else {
	            m = "잘못 입력하셨습니다. 다시 입력해주세요.";
	            System.out.print("어떤 색상을 사용하시나요?: ");
	            moisture = sc.nextInt();	//수분감 입력
	        }
			System.out.println(m + "를 선택하셨습니다. ");
			System.out.println(" ");
			System.out.println("--------------------------------------");
			
			
			
			while (repeatSwitch) {
				//5. 완료(Finish)
				System.out.println("--------------------------------------");
				System.out.println(" ");
				System.out.println("선택이 완료되었습니다.");
				System.out.println(" ");
				System.out.println("1. 밝기(Bright)");
				System.out.println("2. 색상(Color)");
				System.out.println("3. 제형(Texture)");
				System.out.println("4. 수분감(Moisture)");
				System.out.println("5. 완료(Finish)");
				System.out.println(" ");
				System.out.print("수정하실 항목의 번호를 입력하세요: ");
				int menu = sc.nextInt();
				System.out.println(" ");
				
				switch (menu) {
				case 1:	//밝기(Bright)
					System.out.println(" ");
					System.out.println("밝기를 다시 선택하여 주세요. ");
					System.out.println("| 13호 = 1 |");
					System.out.println("| 15호 = 2 |");
					System.out.println("| 17호 = 3 |");
					System.out.println("| 19호 = 4 |");
					System.out.println("| 21호 = 5 |");
					System.out.println("| 23호 = 6 |");
					System.out.println("| 25호 = 7 |");
					System.out.println("| 27호 = 8 |");
					System.out.print("몇호를 사용하시나요?: ");
					bright = sc.nextInt();	//밝기 입력
					System.out.println(" ");
					// 입력받은 값을 밝기 호수로 저장하기
					if (bright == 1) {
			            b = "13호";
			        } else if (bright == 2) {
			            b = "15호";
			        } else if (bright == 3) {
			            b = "17호";
			        } else if (bright == 4) {
			            b = "19호";
			        } else if (bright == 5) {
			            b = "21호";
			        } else if (bright == 6) {
			            b = "23호";
			        } else if (bright == 7) {
			            b = "25호";
			        } else if (bright == 8) {
			            b = "27호";
			        } else {
			            b = "잘못 입력하셨습니다. 다시 입력해주세요.";
			            System.out.print("몇호를 사용하시나요?: ");
						bright = sc.nextInt();	//밝기 입력
			        }
					System.out.println(b + "를 선택하셨습니다. ");
					System.out.println(" ");
					System.out.println("--------------------------------------");
					break;
					
				case 2: //2. 색상(Color)
					System.out.println(" ");
					System.out.println("2. 당신의 색상을 선택하세요(Choose your color). ");
					System.out.println("| 옐로우베이스 아이보리(yellow ivory) = 1 |");
					System.out.println("| 핑크베이스 아이보리(pink ivory) = 2 |");
					System.out.println(" ");
					System.out.print("어떤 색상을 사용하시나요?: ");
					color = sc.nextInt();	//색상 입력
					System.out.println(" ");
					// 입력받은 값을 색상으로 저장하기
					if (color == 1) {
						c = "옐로우베이스 아이보리(yellow ivory)";
					}else if (color == 2) {
						c = "핑크베이스 아이보리(pink ivory)";
					}else {
			            c = "잘못 입력하셨습니다. 다시 입력해주세요.";
			            System.out.print("어떤 색상을 사용하시나요?: ");
						color = sc.nextInt();	//색상 입력
			        }
					System.out.println(c + "를 선택하셨습니다. ");
					System.out.println(" ");
					System.out.println("--------------------------------------");
					break;
					
				case 3: //3. 제형(Texture)
					System.out.println(" ");
					System.out.println("3. 당신의 제형을 선택하세요(Choose your texture). ");
					System.out.println("| 팩트(35g) = 1 |  (18000원=기본가격)");
					System.out.println("| 파운데이션(120g) = 2 |  (+15000원)");
					System.out.println("| 파우더(30g) = 3 |  (-5000원)");
					System.out.println("| 크림(60g) = 4 |  (+20000원)");
					System.out.println("| 스틱(20g) = 5 |  (+5000원)");
					System.out.println(" ");
					System.out.print("어떤 제형을 사용하시나요?: ");
					texture = sc.nextInt();	//제형 입력
					System.out.println(" ");
					// 입력받은 값을 제형으로 저장하기
					if (texture == 1) {
						t = "쿠션(35g)";
					}else if (texture == 2) {
						t = "파운데이션(120g)";
					}else if (texture == 3) {
						t = "파우더(30g)";
					}else if (texture == 4) {
						t = "크림(60g)";
					}else if (texture == 5) {
						t = "스틱(20g)";
					}else {
			            t = "잘못 입력하셨습니다. 다시 입력해주세요.";
			            System.out.print("어떤 색상을 사용하시나요?: ");
			            texture = sc.nextInt();	//제형 입력
			        }
					System.out.println(t + "를 선택하셨습니다. ");
					System.out.println(" ");
					System.out.println("--------------------------------------");
					break;
					
				case 4: //4. 수분감(Moisture)
					System.out.println(" ");
					System.out.println("4. 당신의 수분감을 선택하세요(Choose your moisture). ");
					System.out.println("| 매트(matte type) = 1 |");
					System.out.println("| 세미매트(semi matte type) = 2 |");
					System.out.println("| 광택(glossy) = 3 |");
					System.out.println(" ");
					System.out.print("어떤 수분감을 사용하시나요?: ");
					moisture = sc.nextInt();	//수분감 입력
					System.out.println(" ");
					// 입력받은 값을 수분감으로 저장하기
					if (moisture == 1) {
						m = "매트(matte type)";
					}else if (moisture == 2) {
						m = "세미매트(semi matte type)";
					}else if (moisture == 3) {
						m = "광택(glossy)";
					}else {
			            m = "잘못 입력하셨습니다. 다시 입력해주세요.";
			            System.out.print("어떤 색상을 사용하시나요?: ");
			            moisture = sc.nextInt();	//수분감 입력
			        }
					System.out.println(m + "를 선택하셨습니다. ");
					System.out.println(" ");
					System.out.println("--------------------------------------");
					break;
					
				case 5:
					cnd = false;
					repeatSwitch = false;
					break;

					
				default:
					System.out.println(" ");
					System.out.println("다시 입력하세요.");
					System.out.println(" ");
					break;
				}
			}
		}while(cnd);
		price = 18000;
		p = "+0원";
		if (t == "쿠션(35g)") {
			price = 18000;
		}else if (t == "파운데이션(120g)") {
			price = price + 15000;
			p = "+15000원";
		}else if (t == "파우더(30g)") {
			price = price - 5000;
			p = "-5000원";
		}else if (t =="크림(60g)") {
			price = price + 20000;
			p = "+20000원";
		}else if(t == "스틱(20g)") {
			price = price + 5000;
			p = "+5000원";
		}else
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("--------------------------------------");
		System.out.println(" ");
		System.out.println( list_u[i].username + "님이 주문하신 상품은 {{" + b + " " + c + " " + m + " "  + t +"}}타입의 제품입니다."); //회원이름 추가해야함.
		System.out.println(" ");
		System.out.println("--------------------------------------");
		System.out.println(" ");
		System.out.println("[주문 상세 정보]");
		System.out.println("주문번호(order id):" + list_o[i].orderid); 	//order id 넣기.
		System.out.println("상품 기본 금액: 18000원");
		System.out.println("주소지: " + list_u[i].adrs1 + "도(특별시/광역시/자치도)" + list_u[i].adrs2 + "시/군/구" + list_u[i].adrs3 + "동/면/리");
		System.out.println("선택항목1 (밝기): " + b + " [" + p + "]");
		System.out.println("선택항목2 (색상): " + c + " [" + p + "]");
		System.out.println("선택항목3 (제형): " + t + " [" + p + "]");
		System.out.println("선택항목4 (수분감): " + m + " [" + p + "]");
		System.out.println("--------------------------------------");
		System.out.println("배송비: 0원 ");
		System.out.println("총 상품 금액: " + price + "원");
		System.out.println(" ");
		System.out.println("주문해주셔서 감사합니다. 상품은 다음날 오후에 받아보실 수 있습니다. ");
		System.out.println(" ");
		System.out.println("--------------------------------------");
	}

}