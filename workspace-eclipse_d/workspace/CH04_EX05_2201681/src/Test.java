
public class Test {
	public static void main(String[] args) {
		//while <--> for
		//미션1 (for문으로 변환)
		//#1
		int a=0;
		while(a<10) {
			System.out.println(a);
			a++
		}
		//답1-1
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//#2 
		a=10;
		while(a>0) {
			System.out.println(a);
			a-=2;
		}
		//답
		for(int i=10; i>10; i-=2) {
			System.out.println(i);
		}
		
		
		//미션2 (while문으로 변환)
		//#1
		for(int i=0; i<5; i++) {
			System.out.println("A");
		}
		//답
		a=0;
		while(a<5) {
			System.out.println("A");
			a++;
		}
		
		//#2
		for(int i=10; i>0; i-=2) {
			System.out.println("A");
		}
		//답
		a=10;
		while(a>0) {
			System.out.println("A");
			a-=2;
		}
		
		//#3
		for(;;) {
			System.out.println("A");
		}
		//답
		while(true) {
			System.out.println("A");
		}
	}
}
