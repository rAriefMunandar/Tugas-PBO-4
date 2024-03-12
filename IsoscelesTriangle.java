package Triangle;

public class IsoscelesTriangle extends Triangle {
    private Double base;
    private Double height;

    public IsoscelesTriangle(String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
    }

    public void calculateArea() {
        super.area = (base * height) / 2;
    }

    public void getInfo() {
        System.out.println("IsoscelesTriangle "+name+" info");
        System.out.println(" area: " + super.area);
        System.out.println(" with base: " + base);
        System.out.println(" and height: " + height);
        System.out.println();
    }
}
