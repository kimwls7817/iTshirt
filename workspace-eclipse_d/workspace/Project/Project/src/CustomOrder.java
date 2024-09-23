import java.util.Scanner;

public class CustomOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exitProgram = false;
        
        static User[] list_u = new User[10];
		static Order[] list_o = new Order[10];	//User 타입의 배열 생성
		boolean cnd = true;	//반복
		
		int bright, color, texture, moisture, price;
		String b, c, t, m, p;
		boolean repeatSwitch = true;

        while (!exitProgram) {
        	System.out.println("--------------------------------------");
			System.out.println(" ");
            System.out.println("1. 회원등록");
            System.out.println("2. 주문하기");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Handle user registration
                    registerUser(sc);
                    break;
                case 2:
                    // Handle new order
                    createOrder();
                    break;
                case 3:
                    exitProgram = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
        sc.close();
    }

    private static void registerUser(Scanner sc) {
    	String username, userid, pwd, adrs1, adrs2, adrs3;
    	User[] list_u = new User[10];
    	boolean cnd = true;	//반복
//    	System.out.println("--------------------------------------");
//		System.out.println(" ");
//        System.out.print("Username: ");
//        String username = sc.next();
//        System.out.println(" ");
//        System.out.print("UserID: ");
//        String userid = sc.next();
//        System.out.println(" ");
//        System.out.print("Password: ");
//        String pwd = sc.next();
//        System.out.println(" ");
//        System.out.print("Address1: ");
//        String adrs1 = sc.next();
//        System.out.println(" ");
//        System.out.print("Address2: ");
//        String adrs2 = sc.next();
//        System.out.println(" ");
//        System.out.print("Address3: ");
//        String adrs3 = sc.next();
//        System.out.println(" ");
//        System.out.println("--------------------------------------");

    	do { 
			System.out.println("--------------------------------------");
			System.out.println(" ");
			System.out.println("1. 회원등록(Sign up)");
			System.out.println("2. 로그인(Login)");
			System.out.println("3. 회원출력(Print)");
			System.out.println("4. 종료(Exit)");
			System.out.println(" ");
			System.out.println("--------------------------------------");

			System.out.print("번호를 입력하세요: ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:		//회원등록
				System.out.println("");
				System.out.print("이름: ");
				username = sc.next(); //이름 입력
				System.out.println("");
				System.out.println("-주소지 입력-");
				System.out.print("도(특별시/광역시/자치도): ");
				adrs1 = sc.next(); //도(특별시/광역시/자치도) 입력
				System.out.println("");
				System.out.print("시/군/구: ");
				adrs2 = sc.next(); //시/군/구 입력
				System.out.println("");
				System.out.print("동/면/리: ");
				adrs3 = sc.next(); //동/면/리 입력
				System.out.println(" ");
				System.out.print("아이디: ");
				userid = sc.next();	//아이디입력
				System.out.print("비밀번호: ");
				pwd = sc.next(); 	//비밀번호 입력
				System.out.println(" ");
				list_u[User.count] = new User(username, userid, pwd, adrs1, adrs2, adrs3);	//list배열에 User 삽입
				User.count++;
				break;
				
			case 2: //로그인
				System.out.println("* 로그인 *");
				System.out.print("아이디 입력: ");
				userid = sc.next();
				System.out.print("비밀번호 입력: ");
				pwd = sc.next();
				boolean isLogin = false;
				
				//일치여부 확인
				for(int i = 0; i<User.count; i++) {
					if((list_u[i].userid).equals(userid) && (list_u[i].pwd).equals(pwd))
						System.out.println("로그인 성공!");
				}
				if(!isLogin)	//not 연산자
					System.out.println("로그인 실패!!");
				break;
				
			case 3:		//출력
				for (int i=0; i<User.count ; i++) {	
					System.out.println(" ");
					System.out.println(list_u[i].username + " 고객님 안녕하세요!");
					System.out.println("[로그인 정보]");
					System.out.println("id: " + list_u[i].userid + "     pwd: " + list_u[i].pwd);
					System.out.println("주소지: " + list_u[i].adrs1 + "도(특별시/광역시/자치도)" + list_u[i].adrs2 + "시/군/구" + list_u[i].adrs3 + "동/면/리");
					System.out.println(" ");
				}
				
			case 4:
				cnd = false;
				break;
				
			default:
				System.out.println(" ");
				System.out.println("다시 입력하세요.");
				System.out.println(" ");
				break;
			}
		}while(cnd);
		System.out.println("프로그램 종료!");
		
        User.list_u[User.count] = new User(userid);
        User.count++;
        System.out.println("User registered successfully.");
    }

    private static void createOrder() {
        Order order = new Order();
        System.out.println("Order created with ID: " + order.getOrderID());
    }
}
