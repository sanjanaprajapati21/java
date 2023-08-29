public class CircleTester {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}