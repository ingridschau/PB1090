public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello. World.");

        Circle circle1 = new Circle(5, "Red");

        System.out.println(circle1);

    }
}

class Circle {
    int radius;
    String colour;

    Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
}