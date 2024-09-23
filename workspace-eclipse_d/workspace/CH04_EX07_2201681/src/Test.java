
public class Test {
	public static void main(String[] args) {
		//break 제어문
		//다음 for문의 출력 회수를 써라.
		for(int i=0; i<10; i++) { //5번
			if(i>4) 
				break;			
			System.out.println(i);
		}
		
		for(int i=0; i<10; i++) { //6번
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		for(int i=0; i<5; i++) { //2+2+2+2+2=10
			for(int j=0; j<4; j++) {
				if(j==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //4+4+0+4+4=16번
			for(int j=0; j<4; j++) {
				if(i==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //1+0+1+1+1=4번
			for(int j=0; j<4; j++) {
				if(i==1 || j==1) {
					break;
				}
				System.out.println("A");
			}
		}
		//break을 만났을때 이중for문을 한꺼번에 탈출하도록 코드를 수정하라. 
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) { 
					i=10;
					break;
				}				
				System.out.println("A");
			}
		}
		
		abc: for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(j==3) {
					break abc;
				}
				System.out.println("A");
			}
		}
		
	}
}