package Circle;

import Shape.Shape;

public class Circle extends Shape {
    protected Double fingers;
    protected  String name;

    public Circle(String name, Double fingers ){
        this.name = name;
        this.fingers = fingers;
        this.calculateArea();
    }

    public void calculateArea() {
        super.area = Math.PI * fingers * fingers;
    }

    public void getInfo() {
        System.out.println("Circle " + this.name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" with fingers : " + fingers);
        System.out.println();
    }
}
