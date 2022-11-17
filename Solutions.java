class Shape {
    void draw() {
        System.out.println("Lets draw shapes");
    }
    void erase(){
        System.out.println("Now erasing shapes");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Lets draw a circle");
    }

    @Override
    void erase() {
        System.out.println("Now erasing circle");
    }
}
class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Lets draw a triangle");
    }

    @Override
    void erase() {
        System.out.println("Now erasing triangle");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.print("Lets draw a square");
    }

    @Override
    void erase() {
        System.out.println("Now erasing square");
    }
}
public class Solutions{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Shape();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}