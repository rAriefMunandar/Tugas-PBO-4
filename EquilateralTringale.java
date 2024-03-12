package Triangle;

public class EquilateralTringale extends Triangle{
    private Double side;
    public EquilateralTringale(String name, Double side) {
        super();
        this.name = name;
        this.side = side;
        this.calculateArea();
    }

    public void calculateArea() {
        super.area = (Math.sqrt(3) / 4) * Math.pow(this.side, 2);
    }


    public void getInfo() {
        System.out.println("EquilateralTringale "+name+" info");
        System.out.println(" area: " + super.area);
        System.out.println(" with side: " + side);
        System.out.println();
    }
}
