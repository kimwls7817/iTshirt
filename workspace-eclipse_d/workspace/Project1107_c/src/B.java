
class B extends A{
	// @overriding
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc();	//this.abc();
	}
}
