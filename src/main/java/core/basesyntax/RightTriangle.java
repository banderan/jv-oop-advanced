package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return 0;
    }
    @Override
    public String draw() {
        return null;
    }
}
