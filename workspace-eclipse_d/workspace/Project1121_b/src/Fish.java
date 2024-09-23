
public class Fish extends Animal{
	String name;
	Fish(String name){
		this.name = name;
	}
	
	@Override
	public void move() {
		System.out.println("지느러미로 move");
	}
};
