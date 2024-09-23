
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1. Human 객체 (필드2, 메서드2)
		Human h = new Human();
		h.name = "홍길동";
		h.age = 16;
		h.eat();
		h.sleep();
		
		//#2. Student 객체 (필드2+1, 메서드2+1)
		Student s = new Student();
		s.name = "김민성";
		s.age = 15;
		s.studentID=128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//#3. Worker 객체 (필드2+1, 메서드2+1)
		Worker w = new Worker();
		w.name = "김현지";
		w.age = 30;
		w.workerID=113;
		w.eat();
		w.sleep();
		w.goToWork();
	}

}
