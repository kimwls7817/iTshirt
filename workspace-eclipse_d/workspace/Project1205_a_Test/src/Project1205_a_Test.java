import java.util.Scanner;

//이름이 같은지 비교해 출력
// equals() 사용
public class Project1205_a_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String id = "홍길동";
		
		System.out.print("이름 입력: ");
		name = sc.next();
		
		// 문자열 비교 : equals()
		if(name.equals("kim"))
			System.out.println("같음.");
		else
			System.out.println("다름. ");
		
		if(name.equals(id))
			System.out.println("id 같음.");
		else
			System.out.println("id 다름. ");
	}

}
