
public class Test {
	A a = new A();
	a.abc();    //객체생성 후에만 사용 가능
	
	A.bcd();    //객체생성 없이 바로 사용
	
//	a.bcd():    //쓰지 마시오. 이건 지양할 것. ( 객체생성 후 사용이긴함. )
}
