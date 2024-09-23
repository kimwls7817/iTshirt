// 이름을 입력받아서 저장된 이름과 같으면
// "~님이 입장했음" 출력
// equals() 이용
import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String default_name = "김예진";
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.nextLine();
		if(name.equals(default_name))
			System.out.println(name + "님이 입장했습니다.");
		
	}

}
