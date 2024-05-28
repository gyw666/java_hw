package hw11;

public class hw1 {

}

class Triangle {
    private double side1, side2, side3,area, perimeter;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.perimeter=side1+side2+side3;
        double s=this.perimeter/2;
        this.area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
        double s=this.perimeter/2;
        this.area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public Triangle(double side1, double side2, double side3, double area, double perimeter) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.area = area;
        this.perimeter = perimeter;
    }

    /**
     * 获取
     * @return side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * 设置
     * @param side1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * 获取
     * @return side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * 设置
     * @param side2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * 获取
     * @return side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * 设置
     * @param side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * 获取
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * 设置
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * 获取
     * @return perimeter
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * 设置
     * @param perimeter
     */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String toString() {
        return "Triangle{side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + ", area = " + area + ", perimeter = " + perimeter + "}";
    }
}

