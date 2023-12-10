public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 8);
        Triangle triangle = new Triangle("Triangle",14, 18, 30);
        Square square = new Square("Square", 20);
        Rectangle rectangle = new Rectangle("Rectangle", 13, 10);

        Dog dog = new Dog("Hatiko");
        Cat cat = new Cat("Kitty");

        Drawable[] drawable = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawable.length; i++) {

            if (drawable[i] instanceof Figure){
                System.out.println(((Figure) drawable[i]).getName() + " Периметр -> "
                        + ((Figure) drawable[i]).calcucatePerimeter());
            }

            if (drawable[i] instanceof Animal){
                System.out.println(((Animal) drawable[i]).getName());
            }

            drawable[i].draw();

        }

    }

}