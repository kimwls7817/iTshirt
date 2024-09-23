
public class Test {
	public static void main(String[] args) {
		//for 반복제어문
		int a;
		for(a=0;a<10;a++) {
			System.out.println(a);
		}
		for(int i=0; i<10; i++) {
			System.out.println(i);
		} //위에 a를 int로 이미 명명했기 때문에 int를 for 내부에 또 사용할 수 없다.
		
		//다음 결과에서 A의 출력 개수를 말하세요.
		for(int i=0; i<10; i++) {
			System.out.println("A");
		} //10
		
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		} //5
		
		for(int i=10; i>0; i--) {
			System.out.println("A");
		} //10
		
		for(int i=10; i>0; i-2) {
			System.out.println("A");
		} //5
		
		for(int i=0; i>10; i++) {
			System.out.println("A");
		} //0
		
		for(int i=10; i>0; i++) {
			System.out.println("A");
		} //무한루프 //실행시키기 전에 컴퓨터는 무한루프인지를 알 수 없기 때문에 일단 전체를 실행하여보고 경험적으로 판단.
		
		for(int i=0; ; i++) {
			System.out.println("A");
		} //무한루프 //조건식을 적지 않았기 때문에 실행하지 않아도 무한루프임을 알 수 있기 때문에 그 다음을 작성하지 못하게함.
		for(;;) {
			System.out.println("A");
		} //무한루프
	}
}
