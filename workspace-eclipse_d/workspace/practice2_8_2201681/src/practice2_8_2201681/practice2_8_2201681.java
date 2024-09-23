package practice2_8_2201681; //package에 이름을 넣어서 필요한 문장

import java.util.Arrays;

public class practice2_8_2201681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] dArr = {1.0, 2.0, 3.0, 4.0};
		System.out.println(Arrays.toString(dArr));

		double sum = 0.0;
		for (int i=0; i<=dArr.length; i++) {
			sum += dArr[i];
		}
		System.out.println("합: " + sum);

	}

}
