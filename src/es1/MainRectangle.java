package es1;


public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(2,3);
        // funzione printRectangle
        printRectangle(rectangle1);
        printTwoRectangles(rectangle1, rectangle2);
    }
    public static void printRectangle(Rectangle rectangle) {
        System.out.println("perimeter: " + rectangle.perimeter());
        System.out.println("area: " + rectangle.area());
    }

    public static void printTwoRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        System.out.println("first triangle perimeter: " + rectangle1.perimeter() + ", first triangle area: " + rectangle1.area());
        System.out.println("second triangle perimeter: " + rectangle2.perimeter() + ", second triangle area: " + rectangle2.area());
        int perimeterSum = rectangle1.perimeter() + rectangle2.perimeter();
        int areaSum = rectangle1.area() + rectangle2.area();
        System.out.println("perimeters' sum: " + perimeterSum + ", area's sum: " + areaSum);
    }
}
