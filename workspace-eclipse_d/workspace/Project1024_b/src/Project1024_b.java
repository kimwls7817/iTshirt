// 부모(super) class
class Shape {
	int x, y;
	void draw() {
		System.out.println("DrawShape - 도형 그리기");
	}
}

class Rectangle extends Shape {
	int width, height;	//가로, 세로
    @Override
    void draw() {
        System.out.println("Rectangle - 그리기");
    }

    void getArea() {
        System.out.print("사각형의 넓이 : ");
        System.out.println(width * height);
    }
}

class Circle extends Shape {
	int  radius;	//반지름
    @Override
    void draw() {
        System.out.println("Circle - 그리기");
    }

    void getArea() {
        System.out.print("원의 면적 : ");
        System.out.println(radius * 3.14);
    }
}

class Triangle {
	int base;
}

public class Project1024_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape 객체 s 생성
		Shape s = new Shape();
		// Rectangle 객체 r 생성
		Rectangle r = new Rectangle();
		// upcasting
		Shape s = new Rectangle();
		
		// instanceof 연산자
		if (s instanceof Rectangle) {
			System.out.println("사각형으로 casting함.");
		}
		if (s instanceof Shape) {
			System.out.println("Shape 객체임.");
		}
		
		s.x = 100;
		s.y = 200;
		s.draw();
		
//		s.width = 10;	//Shape s이기 때문에	//error
//		s.getArea();	//error
		
		((Rectangle)s).width = 10;	//downcasting. 괄호 반드시 있어야함.
		((Rectangle)s).getArea();	
		
		// Circle의 반지름으로 원 면적 구하기
		Shape c = new Circle();		//upcasting
		((Circle)c).radius = 300;	//downcasting
		((Circle)c).getArea();
		
		Shape c2 = new Shape();
//		((Circle).c2)radius = 10;	//상속이 존재하므로
		
//		((Triangle)c2).base = 20;	//error
		// Downcasting
        if (upcasted instanceof Rectangle) {
            Rectangle downcasted = (Rectangle) upcasted;
            downcasted.width = 10;
            downcasted.getArea();
        }

        Shape c = new Circle();

        if (c instanceof Circle) {
            System.out.println("원으로 casting함.");
        }
        if (c instanceof Shape) {
            System.out.println("Shape 객체임.");
        }

        ((Circle) c).radius = 300;
        ((Circle) c).getArea();

        Shape c2 = new Shape();
        // You can't downcast c2 to Circle because c2 is not a Circle object.

        // Similarly, you cannot downcast c2 to Triangle.
    }
}

