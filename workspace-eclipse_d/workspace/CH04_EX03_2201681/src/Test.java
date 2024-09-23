
public class Test {
	public static void main(String[] args) {
		
		//switch <--> if
		
		//미션1
		int a=8;
		if(a>=9) {
			System.out.println("A");
		}
		else if(a==8) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		//답1
		a=8;
		switch(a) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("D");
		}
		
		
		
		//미션2
		a=8;
		switch(a) {
		case 10:
			System.out.println("A"); break;
		case 9:
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		}
		
		//답2
		if (a==10) {
			System.out.println("A");
		}
		else if (a>=8) { 
			System.out.println("B");
		}
		//else if (a==9 || a==8) {      //OR연산자
		//	System.out.println("B");
		//}
		else if (a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		
		//미션3
		a=85;
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		//답3
		a=85;
		int b = (int)a/10;
		//switch(a/10) {
		switch(b) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
			System.out.println("F");
		}
	}
}

