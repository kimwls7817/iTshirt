
public class practice2_7_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		카드모양과 숫자를 저장하여 배열 두개를 생성. 
//		Math.random()으로 5장의 카드를 선택하여 출력하는 프로그램.
		String[] list1 = {"Clubs", "Diamonds", "Hearts", "Space"};
		String[] list2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
//		배열의 인덱스는 주로 i, j, k, l, m, n 사용.
		int k, m;
		
		for(int i=0; i<5; i++) {
			k = (int) (Math.random()*4);	//카드타입 인덱스(0-3)
			m =  (int) (Math.random()*13);	// 숫자 인덱스(0-12)
			System.out.println(list1[k] + "의 " + list2[m]);
		
		}
	}

}
