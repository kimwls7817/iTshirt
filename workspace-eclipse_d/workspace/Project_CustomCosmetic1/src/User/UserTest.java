package User;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] list = new User[10];	//User 타입의 배열 생성
		boolean cnd = true;	//반복
		String id, pwd;

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
				System.out.println(" ");
				System.out.println("아이디: ");
				id = sc.next();	//아이디입력
				System.out.println("비밀번호: ");
				pwd = sc.next(); 	//비밀번호 입력
				System.out.println(" ");
				list[User.count] = new User(id, pwd);	//list배열에 User 삽입
				User.count++;
				break;
			case 3:		//출력
				for (int i=0; i<User.count ; i++) {
					System.out.println(" ");
					System.out.println("id: " + list[i].userid + "     pwd: " + list[i].pwd);
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
	}
}