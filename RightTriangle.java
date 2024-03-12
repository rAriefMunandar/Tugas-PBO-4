package Triangle;

public class RightTriangle extends Triangle{
    private Double base;
    private Double height;

    public RightTriangle(String name, Double base, Double height) {
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();

        double side3 = this.getHypotenuse();
        super.side1 = base;
        super.side2 = height;
        super.side3 = side3;
    }

    public Double getHypotenuse() {
        return Math.sqrt((base * base) + (height * height));
    }
    public void calculateArea() {
        super.area = (base * height) / 2;
    }
    public void getInfo() {
        System.out.println("RightTriangle "+name+" info");
        System.out.println(" area: " + super.area);
        System.out.println(" with base: " + base);
        System.out.println(" and height: " + height);
        System.out.println(" and hypotenuse: " + this.getHypotenuse());
        System.out.println();
    }
}