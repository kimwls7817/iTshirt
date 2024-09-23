package User;

public class User {
	// 1) 필드 선언
		String userid, pwd;	//아이디, 비번
		static int count;	//객체생성의 수

		// 2) 생성자 선언
		User() { }	//자동생성 가능	
		User(String userid, String pwd) {
			this.userid = userid;	// 필드를 가리킴.
			this.pwd = pwd;
		}
		void print() {
			System.out.println();
		}
}