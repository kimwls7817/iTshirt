public class Order {
			// 1) 필드 선언
			String orderid;	//주문아이디
			static int ocount;	//객체생성의 수

			// 2) 생성자 선언
			Order() {
				this.orderid = "ORD" + ocount;
		        ocount++;
			}	//자동생성 가능
			
			Order(String orderid) {
				this.orderid = orderid;	// 필드를 가리킴.
			}
			void print() {
				System.out.println();
			}
}
