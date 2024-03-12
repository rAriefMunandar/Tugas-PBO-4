public class Square {
    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    public void getInfo() {
        System.out.println("Square " + name + " - Side: " + side);
    }
}
