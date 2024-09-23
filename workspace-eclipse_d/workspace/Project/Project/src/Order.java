public class Order {
	// 1) 필드 선언
    private String orderid;	//주문아이디
    private static int ocount = 1;	//객체생성의 수

    // 2) 생성자 선언
    public Order() {
        this.orderid = "ORD" + ocount;
        ocount++;
    }	//자동생성 가능

    public String getOrderID() {
        return orderid;		// 필드를 가리킴.
    }
}
