public class TestEnableGeo {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        Rectangle r1 = new Rectangle(1, 1);
        Rectangle r2 = new Rectangle(2, 2);

        System.out.println("The larger of the two rectangles is the one with area of " + (Rectangle.max(r1, r2)).getArea());

        System.out.println("The larger of the two circles is the one with area of " + (Circle.max(circle1, circle2)).getArea());
    }
    
}
