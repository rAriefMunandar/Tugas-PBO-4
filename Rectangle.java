package Rectangle;

import Shape.Shape;

public class Rectangle extends Shape {
    protected Double _long;
    protected Double _wide;
    protected  String name;
    public Rectangle(String name, Double _long, Double _wide){
        this.name = name;
        this._long = _long;
        this._wide = _wide;
        this.calculateArea();
    }
    public void calculateArea() {
        super.area  = this._long * this._wide;
    }

    public void getInfo() {
        System.out.println("Rectangle " + name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" with long : " +  _long);
        System.out.println(" wide : " + _wide);
        System.out.println();
    }
}