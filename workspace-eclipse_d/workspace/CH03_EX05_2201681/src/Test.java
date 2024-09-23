
public class Test {
	public static void main(String[] args) {
		//삼항연산자
		int a = 3;  
		int b = (a<5)? 10:20;
		System.out.println(b);  //10
		
		a=5;
		b=(a<5)? 30:40; //40
		
		a=5; b=7;
		int c = (a>5)?(b<5)?10:20:(b>2)?30:40;  //30
		System.out.println(c); 
	}
}
