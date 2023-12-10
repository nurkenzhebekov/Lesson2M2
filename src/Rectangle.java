public class Rectangle extends Figure{

    private int sideA, sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calcucatePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public void draw() {
        System.out.println("▬");
    }

}
