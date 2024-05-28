package hw10;

public class hw11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println(c1.area);
        System.out.println(c1.perimeter);
    }
}

class Circle2D {
    double radius;
    double x;
    double y;
    double area;
    double perimeter;

    public Circle2D() {
        this.radius = 1;
        this.x = 0;
        this.y = 0;
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius * radius;

    }

    public Circle2D(double radius, double x, double y, double area, double perimeter) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.area = area;
        this.perimeter = perimeter;
    }

    public boolean contains(double x, double y) {
        return length(x, y) <= radius;
    }

    public boolean overlaps(Circle2D circle) {
        return length(circle.getX(), circle.getY()) <= this.radius+circle.getRadius();
    }

    private double length(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }


    /**
     * 获取
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 获取
     *
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * 设置
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 获取
     *
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * 设置
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * 获取
     *
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * 设置
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * 获取
     *
     * @return perimeter
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * 设置
     *
     * @param perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String toString() {
        return "Circle2D{radius = " + radius + ", x = " + x + ", y = " + y + ", area = " + area + ", perimeter = " + perimeter + "}";
    }
}
