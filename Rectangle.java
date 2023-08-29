class RectangleDemo {

    private int length;
    private int width;

    public RectangleDemo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}

public class Rectangle {

    public static void main(String[] args) {
        RectangleDemo rectangle = new RectangleDemo(10, 5);

        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
    }
}