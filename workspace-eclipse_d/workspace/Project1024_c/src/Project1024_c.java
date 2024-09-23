
public class Project1024_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] arr = new Animal[] {new Bird(), new Cat(), new Dog(), new Fish()};	//Animal type. Animal을 상속받은 객체만 가능.
		
		for (Animal a : arr) {
			a.cry();	//다형성 (method overrideing)
		}
	}
}
