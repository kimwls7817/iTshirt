public class User {

    // 1) 필드 선언
    String username, userid, pwd, adrs1, adrs2, adrs3;
    static User[] list_u = new User[10];    // User 타입의 배열 생성
    static int count = 0;    // 객체생성의 수

    // 2) 생성자 선언
    User(String username, String userid, String pwd, String adrs1, String adrs2, String adrs3) {
        this.username = username;    // 필드를 가리킴.
        this.userid = userid;
        this.pwd = pwd;
        this.adrs1 = adrs1;
        this.adrs2 = adrs2;
        this.adrs3 = adrs3;
    }

    void print() {
        // TODO: Add implementation for print method
    }
}