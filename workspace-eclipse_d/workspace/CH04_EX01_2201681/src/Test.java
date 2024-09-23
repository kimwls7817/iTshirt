
public class Test {
	public static void main(String[] args) {
		//제어문의 중괄호 생략
		int a = 3;
		if (a>3) { //flase
			System.out.println("A");
			System.out.println("B");
		}
		if (a>3)
			System.out.println("A");  //컴파일에 의한 중괄호 내부(중괄호 생략)
			System.out.println("B");  //B
			
			
			
		//if 제어문 type1
			a=3;
			if(a>2) {
				System.out.println("실행1");
			}  //실행1
			if(a>5) {
				System.out.println("실행2");
			}
			
			
			//if 제어문 type2
			a=3;
			if(a<2) {
				a=3;
				if(a>2) {
					System.out.println("실행3");
				}
				else {
					System.out.println("실행4");
				}
			}
			
			
			//if 제어문 type3-1
			int s = 85;
			if(s>=90) {
				System.out.println("A학점");
			}
			else if(s>=80) {
				System.out.println("B학점"); //여기까지만 읽음.
			}
			else if(s>=70) {
				System.out.println("C학점");
			}
			else {
				System.out.println("F학저");
			}  //B학점
			
			//if 제어문 type3-2
			int s = 85;
			if(s>=70) {
				System.out.println("C학점");
			}
			else if(s>=80) {
				System.out.println("B학점");
			}
			else if(s>=90) {
				System.out.println("A학점");
			}
			else {
				System.out.println("F학저");
			}  //C학점
			
			//if 제어문 type3-3
			int s = 85;
			if(s>=70 && s<80) {
				System.out.println("C학점");
			}
			else if(s>=80 && s<90) {
				System.out.println("B학점");
			}
			else if(s>=90) {
				System.out.println("A학점");
			}
			else {
				System.out.println("F학저");
			}
			
			
	}
}
