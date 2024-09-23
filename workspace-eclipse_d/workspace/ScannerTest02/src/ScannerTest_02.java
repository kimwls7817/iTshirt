import java.util.Scanner;

public class ScannerTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int age = scanner.nextInt();
		
		System.out.println("이름을 입력하시오: " + name);
		System.out.println("나이을 입력하시오: " + age);
		System.out.println(name + "님 안녕하세요!" + age + "살이시네요.");
	}

}
