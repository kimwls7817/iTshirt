import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		1. 이름
		String name = scanner.next();
		scanner.nextLine(); // 버퍼를 비움.
//		2. 주소
//		String addr = scanner.next(); 단어만 읽을 수 있음.
		String addr = scanner.nextLine();
//		3. 나이
		int age = scanner.nextInt();
//		4. 몸무게
		double weight = scanner.nextDouble();
		
		System.out.println("이름: " + name);
		System.out.println("주소: " + addr);
		System.out.println("나이: " + age);
		System.out.println("몸무게: " + weight);
	}

}
