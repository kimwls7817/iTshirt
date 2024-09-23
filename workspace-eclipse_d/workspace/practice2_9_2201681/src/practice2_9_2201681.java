import java.util.Scanner;
// word[2] = "hello";

public class practice2_9_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = new String[3];
		int i;
		
		Scanner scan = new Scanner(System.in);
		for (i=0; i<3; i++) {
			System.out.println("단어: ");
			word[i] = scan.next();
		}
		// 배열 출력
		// 1) 인덱스 이용
		for (i=0; i<3; i++) 
			System.out.println(word[i]);
		// 한 줄일 때는 for문과 if문에 중괄호를 쓰지 않아도 실행 가능함.
		
		// 2) 향상된 for 이용
		for (String s : word)    //word 안의 요소를 꺼내서 s에 하나씩 넣음.
			System.out.println(s);
	}

}
