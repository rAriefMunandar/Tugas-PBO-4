import Circle.Circle;
import Rectangle.Rectangle;
import Triangle.*;

public class Main {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        RightTriangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);
        AnyTriangle KLM = new AnyTriangle("KLM", 3.0, 4.0, 5.0);
        IsoscelesTriangle NOP = new IsoscelesTriangle("NOP", 3.0, 5.0);
        EquilateralTringale RSP = new EquilateralTringale("RSP", 3.0);

        Rectangle EFG = new Rectangle("EFG", 3.0, 5.0);
        Circle HIJ = new Circle("HIJ", 7.0);

        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();
        EFG.getInfo();
        HIJ.getInfo();
        KLM.getInfo();
        NOP.getInfo();
        RSP.getInfo();
    }
}