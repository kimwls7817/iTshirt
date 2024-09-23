
public class Test {
	public static void main(String[] args) {
		//do-while
		//1
		int a;
		
		a=0;
		while(a<3) { //3
			System.out.println(a);
			a++; 
		}
		//1-do
		a=0;
		do { //3
			System.out.println(a);
			a++; 
		} while(a<3);
		
		//2
		a=0;
		while(a<1) { //1
			System.out.println(a);
			a++;
		}
		//2-do
		a=0;
		do { //1
			System.out.println(a);
			a++;
		} while(a<1);
		
		//while과 do-while이 다른 유일한 부분
		//3
		a=0;
		while(a<0) { //0
			System.out.println(a);
			a++;
		}	
		//3-do
		a=0;
		do { //0
			System.out.println(a);
			a++;
		} while(a<0);
	}
}
