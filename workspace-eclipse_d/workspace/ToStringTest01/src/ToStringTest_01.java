import java.util.Arrays;

public class ToStringTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"kim", "lee", "hong"};
		int[] num = {1,2,3,4,5};
		System.out.println(Arrays.toString(str)); //for문 없이 배열 안의 값을 전부 출력 가능
		System.out.println(str);
		System.out.println(num);
		System.out.println(Arrays.toString(num));
	}

}
