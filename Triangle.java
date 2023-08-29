class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        double area = triangle.getArea();
        System.out.println("The area of the triangle is " + area);
    }
}
