
		public class Test {
			public static void main(String[] args) {
				//continue 제어문
				//다음 for문의 출력 회수를 써라.
				for(int i=0; i<10; i++) { //번
					if(i>4) 
						continue;			
					System.out.println(i);
				}
				
				for(int i=0; i<10; i++) { //번
					System.out.println(i);
					if(i==5) {
						continue;
					}
				}
				
				for(int i=0; i<5; i++) { //번
					for(int j=0; j<4; j++) {
						if(j==2) {
							continue;
						}
						System.out.println("A");
					}
				}
				
				for(int i=0; i<5; i++) { //번
					for(int j=0; j<4; j++) {
						if(i==2) {
							continue;
						}
						System.out.println("A");
					}
				}
				
				for(int i=0; i<5; i++) { //번
					for(int j=0; j<4; j++) {
						if(i==1 || j==1) {
							continue;
						}
						System.out.println("A");
					}
				}
				//실행회수를 써라.
				for(int i=0; i<5; i++) {
					for(int j=0; j<4; j++) {
						if(j==3) { 
							i=10;
							continue;
						}				
						System.out.println("A");
					}
				}
				
				abc: for(int i=0; i<5; i++) {
					for(int j=0; j<4; j++) {
						if(j==3) {
							continue abc;
						}
						System.out.println("A");
					}
				}
				
			}
		}