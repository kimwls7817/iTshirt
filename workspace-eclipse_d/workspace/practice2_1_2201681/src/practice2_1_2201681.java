import java.util.Scanner;
// ctrl+shift+o
public class practice2_1_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random()*10);    // 난수발생메소드
		// 난수발생메소드 (0~99까지의 난수 발생)
		// 난수 맞추기 게임
		int num, cnt=0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("정답 예측: ");
			num = scan.nextInt();
			if (num < answer )    // num이 작으면
				System.out.println("low");
			if (num > answer )   // num이 크면
				System.out.println("high");
			cnt++;
		}while (num != answer );    // num과 answer가 다르면 반복
		
		System.out.println(answer);
		System.out.println(cnt + "번 시도했습니다.");
	}

}
