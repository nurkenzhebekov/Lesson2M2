public class Square extends Figure{

    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int calcucatePerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE6");
    }

}
