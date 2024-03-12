package Triangle;

public class AnyTriangle extends Triangle{
    public AnyTriangle(String name, Double side1, Double side2, Double side3) {
        super.name = name;
        super.side1 = side1;
        super.side2 = side2;
        super.side3 = side3;
        super.calculateArea();
    }

    public void getInfo() {
        System.out.println("AnyTriangle " + this.name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" with sides 1: " + side1);
        System.out.println(" and  sides 2: " + side2);
        System.out.println(" and  sides 3: " + side3);
        System.out.println();
    }
}
