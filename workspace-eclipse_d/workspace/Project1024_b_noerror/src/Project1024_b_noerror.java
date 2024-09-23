class Shape {
    int x, y;

    void draw() {
        System.out.println("DrawShape - 도형 그리기");
    }
}

class Rectangle extends Shape {
    int width, height;

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
    int radius;

    @Override
    void draw() {
        System.out.println("Circle - 그리기");
    }

    void getArea() {
        System.out.print("원의 면적 : ");
        System.out.println(radius * 3.14);
    }
}

public class Project1024_b_noerror {

    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle();

        // Upcasting
        Shape upcasted = r;

        if (upcasted instanceof Rectangle) {
            System.out.println("사각형으로 casting함.");
        }
        if (upcasted instanceof Shape) {
            System.out.println("Shape 객체임.");
        }

        upcasted.x = 100;
        upcasted.y = 200;
        upcasted.draw();

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





//Here are the changes made:
//
//1. Removed the duplicate declaration of Shape s in the main method.
//2. Added comments for upcasting and downcasting.
//3. Fixed the usage of upcasted (previously named s in the upcasting example).
//4. Corrected the downcasting of upcasted to Rectangle.
//5. Corrected the usage of Circle c and added checks for casting.
//6. Commented out the code attempting to downcast c2 to Circle and Triangle, as they are not compatible.



