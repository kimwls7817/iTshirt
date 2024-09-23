import java.util.Scanner;

public class practice2_6_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구하려는 범위의 숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		int i = 0, sum = 0, count = 0;
		for (i=0; i<=num; i++) {
			if (i%3==0) {
				if (count%5==0) {
					System.out.println();
				}
				System.out.print(i + "\t\t");
				sum += i;
				count++;
			}
		}
		System.out.print("\n0부터 30까지의 3의 배수 합: " + sum);
	}

}
